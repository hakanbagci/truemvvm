package dev.mobilearchitect.truemvvm.ui.main.list.rectangle

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import dev.mobilearchitect.truemvvm.ui.main.list.square.SquareUiModel
import dev.mobilearchitect.truemvvm.ui.main.list.square.toSquare

class RectangleItemUiModel(
    val squareUiModel: SquareUiModel,
    index: Int
) {

    val index = ObservableInt()
    val label = ObservableField<String>()

    init {
        this.index.set(index)
        label.set("Rectangle\n${index}")
    }
}

fun RectangleItemUiModel.toRectangleItem() = RectangleItem(
    index = this.index.get(),
    label = this.label.get()!!,
    square = this.squareUiModel.toSquare()
)