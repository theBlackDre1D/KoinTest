package com.example.kointest.core.extentions

import android.content.Context

fun Int.colorFromResources(context: Context) = context.resources.getColor(this)