package com.example.kointest.core.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_entity")
    fun getAllNotes(): List<NoteEntity>
}