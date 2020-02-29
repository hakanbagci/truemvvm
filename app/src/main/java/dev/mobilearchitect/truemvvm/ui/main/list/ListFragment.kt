package dev.mobilearchitect.truemvvm.ui.main.list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import dev.mobilearchitect.truemvvm.databinding.FragmentListBinding
import dev.mobilearchitect.truemvvm.ui.base.fragment.BaseFragment
import dev.mobilearchitect.truemvvm.ui.base.viewmodel.withViewModel
import dev.mobilearchitect.truemvvm.ui.main.list.rectangle.RectangleAdapter
import dev.mobilearchitect.truemvvm.ui.main.list.rectangle.RectangleItemUiModel
import javax.inject.Inject

class ListFragment : BaseFragment() {

    @Inject
    lateinit var adapter: RectangleAdapter

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater)
        binding.flRecyclerView.adapter = adapter
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.viewModel = withViewModel {
            initialize(10)
            Log.d("ViewModel", this.toString())
            rectangleItems.observe(viewLifecycleOwner, Observer<List<RectangleItemUiModel>> {
                adapter.submitList(it)
            })
        }
    }

    companion object {
        fun newInstance() =
            ListFragment()
    }
}
