package com.jetbrains.danilov.alex.mylibrary

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize

@Parcelize
class SimpleClass(
    val id: Int,
    val name: String
) : Parcelable {

    companion object : Parceler<SimpleClass> {
        override fun create(parcel: Parcel): SimpleClass = SimpleClass(1, "HackedString")

        override fun SimpleClass.write(parcel: Parcel, flags: Int) {
        }

    }
}