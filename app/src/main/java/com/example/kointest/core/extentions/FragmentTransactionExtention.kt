package com.example.kointest.core.extentions

import androidx.fragment.app.FragmentTransaction
import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment

fun <T: BaseFragment> FragmentTransaction.simpleReplace(frameLayoutID: Int, fragment: T, addToBackstack: Boolean) {
    setCustomAnimations(R.anim.abc_slide_in_top, R.anim.abc_popup_exit)
    replace(frameLayoutID, fragment)
    if (addToBackstack) addToBackStack(null)
    commit()
}