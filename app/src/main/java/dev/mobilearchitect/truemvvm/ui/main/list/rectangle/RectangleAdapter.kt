package dev.mobilearchitect.truemvvm.ui.main.list.rectangle

import androidx.recyclerview.widget.DiffUtil
import dev.mobilearchitect.truemvvm.R
import dev.mobilearchitect.truemvvm.ui.base.databinding.DataBindingRecyclerViewAdapter
import javax.inject.Inject

class RectangleAdapter @Inject constructor() : DataBindingRecyclerViewAdapter<RectangleItemUiModel>(
    itemCallback = object : DiffUtil.ItemCallback<RectangleItemUiModel>() {
        override fun areItemsTheSame(
            oldItem: RectangleItemUiModel,
            newItem: RectangleItemUiModel
        ): Boolean {
            return oldItem.toRectangleItem().index == newItem.toRectangleItem().index
        }

        override fun areContentsTheSame(
            oldItem: RectangleItemUiModel,
            newItem: RectangleItemUiModel
        ): Boolean {
            return oldItem.toRectangleItem() == newItem.toRectangleItem()
        }
    }
) {

    override fun getLayoutIdForPosition(position: Int): Int {
        return R.layout.item_rectangle
    }
}