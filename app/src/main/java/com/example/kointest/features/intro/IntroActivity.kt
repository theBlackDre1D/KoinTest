package com.example.kointest.features.intro

import android.os.Bundle
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kointest.R
import com.example.kointest.core.base.BaseActivity
import com.example.kointest.features.intro.adapter.IntroPageAdapter

class IntroActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val fragments = listOf(
            IntroPageFragment.newInstance(R.drawable.first_image),
            IntroPageFragment.newInstance(R.drawable.first_image),
            IntroPageFragment.newInstance(R.drawable.first_image),
            IntroPageFragment.newInstance(R.drawable.first_image)
        )

        val adapter = IntroPageAdapter(supportFragmentManager, fragments)

    }
}
