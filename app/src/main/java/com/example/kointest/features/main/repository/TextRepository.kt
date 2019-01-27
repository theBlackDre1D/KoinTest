package com.example.kointest.features.main.repository

import android.content.Context
import com.example.kointest.core.database.NoteEntity

interface TextRepository {
    fun getText(): String

    fun getNoteFromDatabase(context: Context): List<NoteEntity>
}