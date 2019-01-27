package com.example.kointest.core.navigation

import android.graphics.drawable.DrawableContainer
import com.example.kointest.core.base.BaseActivity
import com.example.kointest.core.base.BaseFragment
import com.example.kointest.core.extentions.simpleReplace

object Navigation {

    fun <A: BaseActivity, F: BaseFragment> switchFragments(activity: A, frameLayoutID: Int, newFragment: F, addToBackStack: Boolean = true) {
        val transition = activity.supportFragmentManager.beginTransaction()

        transition.simpleReplace(frameLayoutID, newFragment, addToBackStack)
    }
}