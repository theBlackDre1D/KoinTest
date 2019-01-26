package com.example.kointest.features.main

import com.example.kointest.core.use_case.UseCase
import com.example.kointest.features.main.repository.TextRepository

class GetRandomText(val textRepo: TextRepository): UseCase<String, GetRandomText.Params>() {

    override suspend fun run(params: Params): String = textRepo.getText()

    data class Params(val number: Int)
}