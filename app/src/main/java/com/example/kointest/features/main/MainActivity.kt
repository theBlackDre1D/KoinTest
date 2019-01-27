package com.example.kointest.features.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.kointest.R
import com.example.kointest.core.base.BaseActivity
import com.example.kointest.core.extentions.simpleReplace
import com.example.kointest.core.navigation.Navigation
import com.example.kointest.features.add_note.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()

        val transaction = supportFragmentManager.beginTransaction()

        transaction.simpleReplace(R.id.fragmentContainer, MainFragment.newInstance(), true)
    }

    override fun setupUI() {
        super.setupUI()

        setupOnClickListeners()
    }

    private fun setupOnClickListeners() {
        goToAddNote.setOnClickListener {
            Navigation.switchFragments(this, R.id.fragmentContainer, SecondFragment.newInstance())
        }
    }
}
