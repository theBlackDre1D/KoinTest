package com.example.kointest.features.main

import android.content.Context
import com.example.kointest.core.database.NoteEntity
import com.example.kointest.core.use_case.UseCase
import com.example.kointest.features.main.repository.TextRepository

class GetNotesFromDatabase(val textRepo: TextRepository): UseCase<List<NoteEntity>, GetNotesFromDatabase.Params>() {

    override suspend fun run(params: Params): List<NoteEntity> = textRepo.getNoteFromDatabase(params.context)

    data class Params(val context: Context)
}