package dev.mobilearchitect.truemvvm.ui.main.list.square

import dev.mobilearchitect.truemvvm.ui.main.progress.ProgressUiModelFactory
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class SquareUiModelFactory @Inject constructor(
    private val progressUiModelFactory: ProgressUiModelFactory
) {

    fun get(coroutineScope: CoroutineScope, index: Int) = SquareUiModel(
        progressUiModel = progressUiModelFactory.get(),
        coroutineScope = coroutineScope,
        index = index
    )
}