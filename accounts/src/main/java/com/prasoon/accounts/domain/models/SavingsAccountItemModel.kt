package com.prasoon.accounts.domain.models

import android.view.View
import android.view.ViewParent
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.prasoon.accounts.R

open class SavingsAccountItemModel :
    EpoxyModelWithHolder<SavingsAccountItemModel.SavingsAccountItemHolder>() {

    @EpoxyAttribute
    lateinit var title: String

    @EpoxyAttribute
    lateinit var balance: String


    class SavingsAccountItemHolder : EpoxyHolder() {
        lateinit var tvAccnumber: TextView
            private set
        lateinit var tvAccBalance: TextView
            private set

        override fun bindView(itemView: View) {
            tvAccnumber = itemView.findViewById(R.id.tvAccountNumber)
            tvAccBalance = itemView.findViewById(R.id.tvAccountBalance)
        }
    }

    override fun getDefaultLayout(): Int {
        return R.layout.item_savings_accounts_layout
    }

    override fun createNewHolder(parent: ViewParent): SavingsAccountItemHolder {
        return SavingsAccountItemHolder()
    }

    override fun bind(holder: SavingsAccountItemHolder) {
        holder.tvAccnumber.text = title
        holder.tvAccBalance.text = balance
    }
}