package com.example.kointest.core.extentions

import androidx.fragment.app.FragmentTransaction
import com.example.kointest.core.base.BaseFragment

fun <T: BaseFragment> FragmentTransaction.simpleReplace(frameLayoutID: Int, fragment: T, addToBackstack: Boolean) {
    replace(frameLayoutID, fragment)
    if (addToBackstack) addToBackStack(null)
    commit()
}