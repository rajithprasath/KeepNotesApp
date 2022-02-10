package com.rajith.keepnotes.feature_notes.domain.util

sealed class OrderType{

    object Ascending: OrderType()
    object Descending: OrderType()
}
