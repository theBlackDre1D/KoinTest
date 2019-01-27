package com.example.kointest.core.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "note_entity")
data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "text")
    @NotNull
    var text: String,

    /**
     * String in format DD-MM-YYYY
     */
    @ColumnInfo(name = "creation_date")
    @NotNull
    var creationDate: String
)