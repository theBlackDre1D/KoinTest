package com.example.kointest.core.di

import androidx.room.Room
import com.example.kointest.core.database.NotesDatabase
import com.example.kointest.features.add_note.AddNewNote
import com.example.kointest.features.add_note.AddNoteViewModel
import com.example.kointest.features.main.GetNotesFromDatabase
import com.example.kointest.features.main.GetRandomText
import com.example.kointest.features.main.repository.TextRepository
import com.example.kointest.features.main.repository.TextRepositoryImp
import com.example.kointest.features.main.view_models.GetTextViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val modules = module {

    // Room database
    single { get<NotesDatabase>().noteDAO() }
    single { Room.databaseBuilder(androidApplication(), NotesDatabase::class.java, "notes-db").build() }

    // Repositories implementation
    single<TextRepository> { TextRepositoryImp( get() ) }

    // Use Cases
    single { GetRandomText( get() ) }
    single { GetNotesFromDatabase( get() ) }
    single { AddNewNote( get() ) }

    // View Models
    viewModel { GetTextViewModel( get(), get() ) }
    viewModel { AddNoteViewModel( get() ) }
}