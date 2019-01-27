package com.example.kointest.features.add_note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.kointest.R
import com.example.kointest.core.base.BaseFragment
import com.example.kointest.core.database.NoteEntity
import com.example.kointest.core.extentions.colorFromResources
import kotlinx.android.synthetic.main.fragment_second.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment: BaseFragment() {

    private val addNoteViewModel: AddNoteViewModel by viewModel()

    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
    }

    override fun setupUI() {
        super.setupUI()

        setupOnClickListeners()

        addNoteViewModel.getLiveData().observe(this, Observer { value ->
            if (value is Long) {
                twSuccesInfo.text = "SUCCESS"
                twSuccesInfo.setBackgroundColor(R.color.green.colorFromResources(context!!))
            } else {
                twSuccesInfo.text = "FAILURE"
                twSuccesInfo.setBackgroundColor(R.color.red.colorFromResources(context!!))
            }
        })
    }

    private fun setupOnClickListeners() {
        bAddNote.setOnClickListener {
            val newNote = NoteEntity(0L, noteText.text.toString(), "28-01-2019")
            val params = AddNewNote.Params(newNote)
            addNoteViewModel.addNote(params)
        }
    }

}