package com.rajith.keepnotes.feature_notes.presentation.view_note

import com.rajith.keepnotes.feature_notes.domain.model.Note
import com.rajith.keepnotes.feature_notes.domain.util.NoteOrder
import com.rajith.keepnotes.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
