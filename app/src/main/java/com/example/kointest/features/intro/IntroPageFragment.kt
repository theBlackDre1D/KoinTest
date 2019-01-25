package com.example.kointest.features.intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_intro_page.*

class IntroPageFragment: BaseFragment() {

    var imageResID: Int? = null

    companion object {
        fun newInstance(imageResID: Int): IntroPageFragment {
            val fragment = IntroPageFragment()
            fragment.imageResID = imageResID
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_intro_page, container, false)
    }

    override fun setupUI() {
        super.setupUI()

        introImage.setImageResource(imageResID!!)
    }
}