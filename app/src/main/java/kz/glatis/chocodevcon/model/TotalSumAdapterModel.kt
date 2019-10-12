package kz.glatis.chocodevcon.model

import kz.glatis.chocodevcon.core.diff.IAdapterItem


class TotalSumAdapterModel : IAdapterItem {

    var ticketPrice: Int = 21500

    var insurancePrice: Int = 1000

    val totalPrice: Int
        get() = ticketPrice + insurancePrice

}