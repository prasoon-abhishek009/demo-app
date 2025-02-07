package com.prasoon.accounts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.prasoon.accounts.databinding.FragmentAccountsBinding
import com.prasoon.accounts.domain.EpoxySampleController
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class AccountsFragment : Fragment() {

    private lateinit var binding: FragmentAccountsBinding
    private val viewModel: AccountsViewModel by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAccountsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = EpoxySampleController()
        binding.recyclerEpoxy.adapter = controller.adapter

        lifecycleScope.launch {
            viewModel.accounts.collect {
                controller.setData(it)
            }
        }
    }
}