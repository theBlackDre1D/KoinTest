package com.example.kointest.features.intro

import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_intro_page.*

class IntroPageFragment: BaseFragment() {

    override val layoutResource: Int
        get() = R.layout.fragment_intro_page

    var imageResID: Int? = null

    companion object {
        fun newInstance(imageResID: Int): IntroPageFragment {
            val fragment = IntroPageFragment()
            fragment.imageResID = imageResID
            return fragment
        }
    }

    override fun setupUI() {
        super.setupUI()

        introImage.setImageResource(imageResID!!)
    }
}