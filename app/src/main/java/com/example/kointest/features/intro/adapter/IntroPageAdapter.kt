package com.example.kointest.features.intro.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kointest.core.base.BaseFragment

class IntroPageAdapter <T: BaseFragment> (fm: FragmentManager, val fragmentList: List<T>): FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.count()

}