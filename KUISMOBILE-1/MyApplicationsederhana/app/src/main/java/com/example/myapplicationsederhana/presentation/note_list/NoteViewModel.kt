package com.example.noteapp.presentation.note_list

import androidx.lifecycle.ViewModel
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.usecase.GetNotesUseCase
import com.example.noteapp.data.repository.NoteRepositoryImpl

class NoteViewModel : ViewModel() {
    private val getNotesUseCase = GetNotesUseCase(NoteRepositoryImpl())

    val notes: List<Note> = getNotesUseCase()
}
