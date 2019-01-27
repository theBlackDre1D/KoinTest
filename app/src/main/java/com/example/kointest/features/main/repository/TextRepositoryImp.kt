package com.example.kointest.features.main.repository

import android.content.Context
import com.example.kointest.core.database.NoteDao
import com.example.kointest.core.database.NoteEntity
import com.example.kointest.core.database.NotesDatabase

class TextRepositoryImp constructor(val noteDao: NoteDao): TextRepository {
    override fun getText(): String {
        val randomNumber = (0..4).random()
        val textArray = listOf(
                "1 -Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "2 -Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "3 - Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "4 - Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "5 - Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
            )

        return textArray[randomNumber]
    }

    override fun getNoteFromDatabase(context: Context): List<NoteEntity> {
//        val db = NotesDatabase.invoke(context)
//        return db.noteDAO().getAllNotes()
        return noteDao.getAllNotes()
    }
}