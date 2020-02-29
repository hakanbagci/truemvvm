package dev.mobilearchitect.truemvvm.ui.main.list.square

import androidx.databinding.ObservableField
import dev.mobilearchitect.truemvvm.ui.main.progress.ProgressUiModel
import dev.mobilearchitect.truemvvm.ui.main.progress.toProgress
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SquareUiModel(
    val progressUiModel: ProgressUiModel,
    coroutineScope: CoroutineScope,
    index: Int
) {
    val label = ObservableField<String>()

    init {
        progressUiModel.isInProgress.set(true)
        coroutineScope.launch(Dispatchers.IO) {
            delay(2000L)
            label.set("Square\n${index}")
            progressUiModel.isInProgress.set(false)
        }
    }
}

fun SquareUiModel.toSquare() = Square(
    label = this.label.get()!!,
    progress = progressUiModel.toProgress()
)