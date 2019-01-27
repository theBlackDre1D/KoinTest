package com.example.kointest.features.add_note

import com.example.kointest.core.database.NoteEntity
import com.example.kointest.core.use_case.UseCase
import com.example.kointest.features.main.repository.TextRepository

class AddNewNote(private val textRepository: TextRepository): UseCase<Long, AddNewNote.Params>() {

    override suspend fun run(params: Params): Long = textRepository.addNote(params.note)

    data class Params(val note: NoteEntity)
}