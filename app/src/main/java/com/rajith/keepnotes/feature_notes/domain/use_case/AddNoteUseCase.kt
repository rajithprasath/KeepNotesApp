package com.rajith.keepnotes.feature_notes.domain.use_case

import com.rajith.keepnotes.feature_notes.domain.model.Note
import com.rajith.keepnotes.feature_notes.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {

    @Throws(Note.InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw Note.InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw Note.InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}