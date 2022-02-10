package com.rajith.keepnotes.feature_notes.presentation.view_note

import com.rajith.keepnotes.feature_notes.domain.model.Note
import com.rajith.keepnotes.feature_notes.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
