package br.com.fiap.nac_recycleview_paulotadeu_rm80452_pedrobelluomini_rm80187.Model

import android.os.Parcel
import android.os.Parcelable

data class Carro(
        val Marca: String,
        val Modelo: String,
        val Imagem: String
): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Marca)
        parcel.writeString(Modelo)
        parcel.writeString(Imagem)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Carro> {
        override fun createFromParcel(parcel: Parcel): Carro {
            return Carro(parcel)
        }

        override fun newArray(size: Int): Array<Carro?> {
            return arrayOfNulls(size)
        }
    }
}
