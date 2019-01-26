package com.example.kointest.features.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.kointest.R
import com.example.kointest.core.base.BaseActivity
import com.example.kointest.core.extentions.simpleReplace

class MainActivity : BaseActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()

        transaction.simpleReplace(R.id.fragmentContainer, MainFragment.newInstance(), true)
    }
}
