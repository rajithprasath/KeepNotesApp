package com.rajith.keepnotes.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rajith.keepnotes.ui.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }

    class InvalidNoteException(message: String): Exception(message)
}
