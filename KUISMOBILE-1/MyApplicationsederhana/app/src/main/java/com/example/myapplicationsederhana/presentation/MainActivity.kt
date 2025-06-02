package com.example.noteapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.noteapp.presentation.note_list.NoteListScreen
import com.example.noteapp.presentation.note_list.NoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = NoteViewModel()
        setContent {
            NoteListScreen(viewModel = viewModel)
        }
    }
}
