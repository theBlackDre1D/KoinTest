package com.example.kointest.features.main.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kointest.core.database.NoteEntity
import com.example.kointest.features.main.GetNotesFromDatabase
import com.example.kointest.features.main.GetRandomText

class GetTextViewModel constructor(private val getText: GetRandomText,
                       private val getNotes: GetNotesFromDatabase): ViewModel() {

    private val liveData = MutableLiveData<String>()
    private val liveNotes = MutableLiveData<List<NoteEntity>>()

    fun getLiveData() = liveData
    fun getLiveNotes() = liveNotes

    fun loadData(params: GetRandomText.Params) = getText(params) { handleRespond(it) }

    fun loadNotes(params: GetNotesFromDatabase.Params) = getNotes(params) { handleNotes(it) }

    private fun handleRespond(data: String) {
        liveData.value = data
    }

    private fun handleNotes(data: List<NoteEntity>) {
        liveNotes.value = data
    }
}