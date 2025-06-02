package com.example.noteapp.data.repository

import com.example.noteapp.data.source.DummyNoteDataSource
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

class NoteRepositoryImpl : NoteRepository {
    override fun getNotes(): List<Note> {
        return DummyNoteDataSource.notes.map {
            Note(it.id, it.title, it.content)
        }
    }
}
