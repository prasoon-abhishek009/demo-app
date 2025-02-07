package com.prasoon.cards.domain.models

import android.view.View
import android.view.ViewParent
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.prasoon.cards.R

open class CardsDataItemModel : EpoxyModelWithHolder<CardsDataItemModel.CardsDataItemHolder>() {

    @EpoxyAttribute
    lateinit var cardName: String

    @EpoxyAttribute
    lateinit var cardNumber: String

    @EpoxyAttribute
    lateinit var validThru: String

    class CardsDataItemHolder : EpoxyHolder() {
        lateinit var tvName: TextView
            private set
        lateinit var tvCardNumber: TextView
            private set
        lateinit var tvValidThru: TextView
            private set

        override fun bindView(itemView: View) {
            tvName = itemView.findViewById(R.id.tvName)
            tvCardNumber = itemView.findViewById(R.id.tvCardNumber)
            tvValidThru = itemView.findViewById(R.id.tvValidThru)
        }
    }
    override fun getDefaultLayout(): Int {
        return R.layout.item_credit_card_layout
    }

    override fun createNewHolder(parent: ViewParent): CardsDataItemHolder {
        return CardsDataItemHolder()
    }

    override fun bind(holder: CardsDataItemHolder) {
        holder.apply {
            tvName.text = cardName
            tvCardNumber.text = cardNumber
            tvValidThru.text = validThru
        }
    }

}