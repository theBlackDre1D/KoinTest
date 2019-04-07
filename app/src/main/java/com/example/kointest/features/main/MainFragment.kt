package com.example.kointest.features.main

import androidx.lifecycle.Observer
import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment
import com.example.kointest.features.main.view_models.GetTextViewModel
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment: BaseFragment() {

    override val layoutResource: Int
        get() = R.layout.fragment_main

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    private val getRandomTextViewModel: GetTextViewModel by viewModel()


    override fun setupUI() {
        super.setupUI()

        getRandomTextViewModel.getLiveData().observe(this, Observer {
            mainText.text = it
        })
        getRandomTextViewModel.loadData(GetRandomText.Params(0))

        getRandomTextViewModel.getLiveNotes().observe(this, Observer {
            dbText.text = it.count().toString()
        })
        getRandomTextViewModel.loadNotes(GetNotesFromDatabase.Params(activity!!.applicationContext))

        setupButton()
    }

    private fun setupButton() {
        nextText.setOnClickListener {
            getRandomTextViewModel.loadData(GetRandomText.Params(0))
        }
    }

}