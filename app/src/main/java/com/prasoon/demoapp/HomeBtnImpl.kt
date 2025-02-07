package com.prasoon.demoapp

import android.view.View
import android.widget.Toast
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import com.prasoon.home.HomeBtnInterface

class HomeBtnImpl : HomeBtnInterface {

    override fun onClick(view: View) {
        Toast.makeText(view.context, "click from app module", Toast.LENGTH_LONG).show()
//        view.findNavController().navigate(com.prasoon.payments.R.id.payments_navigation)

        val request = NavDeepLinkRequest.Builder
            .fromUri("android-app://prasoon.demo.app/navigation_transfer_money".toUri())
            .build()
        view.findNavController().navigate(request)
    }
}