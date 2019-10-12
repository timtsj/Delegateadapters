package kz.glatis.chocodevcon.adapter

import kotlinx.android.synthetic.main.item_booking.*
import kz.glatis.chocodevcon.R
import kz.glatis.chocodevcon.core.regular.KDelegateAdapter
import kz.glatis.chocodevcon.model.BookingAdapterModel

class BookingAdapter : KDelegateAdapter<BookingAdapterModel>() {

    override val layoutId: Int = R.layout.item_booking

    override fun isForViewType(items: List<*>, position: Int): Boolean = items[position] is BookingAdapterModel

    override fun onBind(item: BookingAdapterModel, viewHolder: KViewHolder) {
        viewHolder.routeLabel.text = "${item.departureCity} - ${item.arrivalCity}"
        viewHolder.routeLabel2.text = "${item.arrivalCity} - ${item.departureCity}"
    }
}