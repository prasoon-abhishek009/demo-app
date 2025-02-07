package com.prasoon.cards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.PagerSnapHelper
import com.prasoon.cards.databinding.FragmentCardsBinding
import com.prasoon.cards.di.CardsScope
import com.prasoon.cards.domain.CardsEpoxyController
import kotlinx.coroutines.launch
import org.koin.android.ext.android.getKoin
import org.koin.core.qualifier.TypeQualifier
import org.koin.core.scope.Scope

class CardsFragment : Fragment() {

    private lateinit var binding: FragmentCardsBinding
    private var cardScope: Scope? = null

    //    private val viewModel: CardsViewModel by inject()
    private lateinit var viewModel: CardsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cardScope = getKoin()
            .getOrCreateScope("CardScope", TypeQualifier(CardsScope::class))
        viewModel = cardScope!!.get()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = CardsEpoxyController()
        val snapHelper = PagerSnapHelper()
        binding.recyclerEpoxy.adapter = controller.adapter
        snapHelper.attachToRecyclerView(binding.recyclerEpoxy)

        lifecycleScope.launch {
            viewModel.cards.collect {
                controller.setData(it)
            }
        }
    }

    override fun onDestroyView() {
        cardScope = null
        super.onDestroyView()
    }
}