package com.rajith.keepnotes.feature_notes.domain.use_case

import com.rajith.keepnotes.feature_notes.domain.model.Note
import com.rajith.keepnotes.feature_notes.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note? {
       return repository.getNoteById(id)
    }
}