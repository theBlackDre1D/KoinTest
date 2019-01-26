package com.example.kointest.core.di

import com.example.kointest.features.main.GetRandomText
import com.example.kointest.features.main.repository.TextRepository
import com.example.kointest.features.main.repository.TextRepositoryImp
import com.example.kointest.features.main.view_models.GetTextViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val modules = module {
    single<TextRepository> { TextRepositoryImp() }

    single { GetRandomText( get() ) }

    viewModel { GetTextViewModel( get() ) }
}