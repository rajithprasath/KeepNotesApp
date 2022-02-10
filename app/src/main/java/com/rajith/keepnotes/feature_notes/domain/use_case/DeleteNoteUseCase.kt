package com.rajith.keepnotes.feature_notes.domain.use_case

import com.rajith.keepnotes.feature_notes.domain.model.Note
import com.rajith.keepnotes.feature_notes.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        noteRepository.deleteNote(note)
    }
}