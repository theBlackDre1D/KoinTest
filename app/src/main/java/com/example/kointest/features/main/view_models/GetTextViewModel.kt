package com.example.kointest.features.main.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kointest.features.main.GetRandomText

class GetTextViewModel(private val getText: GetRandomText): ViewModel() {

    private val liveData = MutableLiveData<String>()

    fun getLiveData() = liveData

    fun loadData(params: GetRandomText.Params) = getText(params)
}