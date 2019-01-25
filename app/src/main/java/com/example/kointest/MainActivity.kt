package com.example.kointest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.kointest.core.base.BaseActivity

class MainActivity : BaseActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
