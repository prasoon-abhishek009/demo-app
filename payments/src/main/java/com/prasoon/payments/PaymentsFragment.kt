package com.prasoon.payments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.prasoon.payments.databinding.FragmentPaymentsBinding

class PaymentsFragment : Fragment() {
    private lateinit var binding: FragmentPaymentsBinding

    private val viewModel: PaymentsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPaymentsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cvTransfer.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://prasoon.demo.app/navigation_transfer_money".toUri())
                .build()
            findNavController().navigate(request)
        }

        binding.clPayment.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://prasoon.demo.app/navigation_pay_bills".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}