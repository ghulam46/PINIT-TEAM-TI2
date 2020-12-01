package com.Kelompok_pinit.pinit1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyData(
    val name: String,
    val lat: Double,
    val lang: Double
) : Parcelable {

}