package dev.mobilearchitect.truemvvm.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.mobilearchitect.truemvvm.databinding.FragmentHomeBinding
import dev.mobilearchitect.truemvvm.ui.base.fragment.BaseFragment
import dev.mobilearchitect.truemvvm.ui.base.viewmodel.withViewModel

class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.viewModel = withViewModel {
            initialize(10)
        }
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}
