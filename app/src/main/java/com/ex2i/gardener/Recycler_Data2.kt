package com.ex2i.gardener

import android.os.Parcel
import android.os.Parcelable

data class Recycler_Data2(
    val name: String = "",
    var image: Int = 0,
    val summary: String = "",
    val effecacy: String? = null,
    val purpose: String? = null
) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
        parcel.writeString(summary)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Recycler_Data2> {
        override fun createFromParcel(parcel: Parcel): Recycler_Data2 {
            return Recycler_Data2(parcel)
        }

        override fun newArray(size: Int): Array<Recycler_Data2?> {
            return arrayOfNulls(size)
        }
    }
}
