package com.ex2i.gardener

import android.os.Parcel
import android.os.Parcelable

data class Recycler_Data(val name: String="", var image: Int=0, val summary: String="") :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
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

    companion object CREATOR : Parcelable.Creator<Recycler_Data> {
        override fun createFromParcel(parcel: Parcel): Recycler_Data {
            return Recycler_Data(parcel)
        }

        override fun newArray(size: Int): Array<Recycler_Data?> {
            return arrayOfNulls(size)
        }
    }
}
