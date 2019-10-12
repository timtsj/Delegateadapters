package kz.glatis.chocodevcon.adapter

import kotlinx.android.synthetic.main.item_auth.*
import kz.glatis.chocodevcon.R
import kz.glatis.chocodevcon.core.regular.KDelegateAdapter
import kz.glatis.chocodevcon.model.AuthAdapterModel

class AuthAdapter : KDelegateAdapter<AuthAdapterModel>() {

    override val layoutId: Int = R.layout.item_auth

    override fun isForViewType(items: List<*>, position: Int): Boolean = items[position] is AuthAdapterModel

    override fun onBind(item: AuthAdapterModel, viewHolder: KViewHolder) {
        viewHolder.phoneEditText.setText(item.placeholder)
    }
}