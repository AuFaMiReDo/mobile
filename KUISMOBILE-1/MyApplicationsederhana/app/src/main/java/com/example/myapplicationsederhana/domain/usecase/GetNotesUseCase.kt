package com.example.noteapp.domain.usecase

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

class GetNotesUseCase(private val repository: NoteRepository) {
    operator fun invoke(): List<Note> = repository.getNotes()
}
