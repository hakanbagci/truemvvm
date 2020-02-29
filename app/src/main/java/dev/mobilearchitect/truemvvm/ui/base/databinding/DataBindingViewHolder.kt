package dev.mobilearchitect.truemvvm.ui.base.databinding

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import dev.mobilearchitect.truemvvm.BR

class DataBindingViewHolder(private val binding: ViewDataBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(uiModel: Any) {
        binding.setVariable(BR.uiModel, uiModel)
        binding.executePendingBindings()
    }
}