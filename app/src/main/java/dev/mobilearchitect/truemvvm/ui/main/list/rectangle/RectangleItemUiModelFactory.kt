package dev.mobilearchitect.truemvvm.ui.main.list.rectangle

import dev.mobilearchitect.truemvvm.ui.main.list.square.SquareUiModelFactory
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class RectangleItemUiModelFactory @Inject constructor(
    private val squareUiModelFactory: SquareUiModelFactory
) {

    fun get(coroutineScope: CoroutineScope, index: Int) =
        RectangleItemUiModel(
            squareUiModel = squareUiModelFactory.get(
                coroutineScope = coroutineScope,
                index = index
            ),
            index = index
        )
}