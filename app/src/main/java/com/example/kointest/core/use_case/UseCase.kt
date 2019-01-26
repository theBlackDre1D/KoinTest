package com.example.kointest.core.use_case

import kotlinx.coroutines.*

abstract class UseCase<out Type: Any, in Params> {

    abstract suspend fun run(params: Params): Type

    operator fun invoke(params: Params, onResult: (Type) -> Unit = {}) {
        val job = SupervisorJob()

        val result = CoroutineScope(Dispatchers.IO + job).async {
            run(params)
        }
        CoroutineScope(Dispatchers.Main).launch { onResult(result.await()) }
    }
}