package com.prasoon.accounts.domain.models

import android.view.View
import android.view.ViewParent
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.prasoon.accounts.R

open class CreditAccountItemModel :
    EpoxyModelWithHolder<CreditAccountItemModel.CreditAccountItemHolder>() {

    @EpoxyAttribute
    lateinit var cardNumber: String

    override fun getDefaultLayout(): Int {
        return R.layout.item_current_account_layout
    }

    override fun createNewHolder(parent: ViewParent): CreditAccountItemHolder {
        return CreditAccountItemHolder()
    }

    override fun bind(holder: CreditAccountItemHolder) {
        holder.tvCardNumber.text = cardNumber
    }

    class CreditAccountItemHolder : EpoxyHolder() {
        lateinit var tvCardNumber: TextView
            private set

        override fun bindView(itemView: View) {
            tvCardNumber = itemView.findViewById(R.id.cardNumber)
        }

    }

}