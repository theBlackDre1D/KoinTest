package com.example.kointest.features.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment
import com.example.kointest.features.main.view_models.GetTextViewModel
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment: BaseFragment() {

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    val getRandomTextViewModel: GetTextViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun setupUI() {
        super.setupUI()

        getRandomTextViewModel.getLiveData().observe(this, Observer {
            mainText.text = it
        })

        getRandomTextViewModel.loadData(GetRandomText.Params(0))
    }

}