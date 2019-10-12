package kz.glatis.chocodevcon.adapter

import kotlinx.android.synthetic.main.item_total_sum.*
import kz.glatis.chocodevcon.R
import kz.glatis.chocodevcon.core.regular.KDelegateAdapter
import kz.glatis.chocodevcon.model.TotalSumAdapterModel

class TotalSumAdapter : KDelegateAdapter<TotalSumAdapterModel>() {

    override val layoutId: Int = R.layout.item_total_sum

    override fun isForViewType(items: List<*>, position: Int): Boolean = items[position] is TotalSumAdapterModel

    override fun onBind(item: TotalSumAdapterModel, viewHolder: KViewHolder) {
        viewHolder.ticketPriceLabel.text = item.ticketPrice.toString()
        viewHolder.insurancePriceLabel.text = item.insurancePrice.toString()
        viewHolder.totalSumLabel.text = item.totalPrice.toString()
    }
}