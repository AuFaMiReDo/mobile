package com.example.noteapp.domain.repository

import com.example.noteapp.domain.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>
}
