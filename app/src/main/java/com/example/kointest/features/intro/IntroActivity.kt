package com.example.kointest.features.intro

import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.kointest.features.main.MainActivity
import com.example.kointest.R
import com.example.kointest.core.base.BaseActivity
import com.example.kointest.features.intro.adapter.IntroPageAdapter
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.intro_footer.view.*

class IntroActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val fragments = listOf(
            IntroPageFragment.newInstance(R.drawable.first_image),
            IntroPageFragment.newInstance(R.drawable.shark),
            IntroPageFragment.newInstance(R.drawable.tiger),
            IntroPageFragment.newInstance(R.drawable.shark)
        )

        viewPager.adapter = IntroPageAdapter(supportFragmentManager, fragments)
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                if (position == viewPager.adapter!!.count - 1) {
                    footer.nextButton.visibility = View.VISIBLE
                } else {
                    footer.nextButton.visibility = View.GONE
                }
            }
        })

        footer.indicator.setViewPager(viewPager)

        setNextButton()
    }

    private fun setNextButton() {
        footer.nextButton.setOnClickListener {
            startActivity(MainActivity.getCallingIntent(this))
            finish()
        }
    }
}
