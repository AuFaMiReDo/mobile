package com.example.noteapp.data.source

import com.example.noteapp.data.model.NoteDto

object DummyNoteDataSource {
    val notes = listOf(
        NoteDto(1, "Belajar Android", "Pelajari Jetpack Compose dan Clean Architecture."),
        NoteDto(2, "Belanja", "Beli susu, roti, dan telur."),
        NoteDto(3, "Meeting", "Meeting jam 10 pagi dengan tim.")
    )
}
