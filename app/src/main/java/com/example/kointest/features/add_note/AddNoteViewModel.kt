package com.example.kointest.features.add_note

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddNoteViewModel(private val addNewNote: AddNewNote): ViewModel() {

    private val liveData = MutableLiveData<Long>()

    fun getLiveData(): MutableLiveData<Long> {
        return liveData
    }

    fun addNote(params: AddNewNote.Params) = addNewNote(params) {  handleRespond(it) }

    private fun handleRespond(rowID: Long) {
        liveData.value = rowID
    }
}