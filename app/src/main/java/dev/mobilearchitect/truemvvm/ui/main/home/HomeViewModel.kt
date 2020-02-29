package dev.mobilearchitect.truemvvm.ui.main.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.mobilearchitect.truemvvm.ui.main.home.actions.ActionsUiModelFactory
import dev.mobilearchitect.truemvvm.ui.main.home.summary.SummaryUiModelFactory
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    summaryUiModelFactory: SummaryUiModelFactory,
    actionsUiModelFactory: ActionsUiModelFactory
) : ViewModel() {

    private var isInitialized = false

    val summaryUiModel = summaryUiModelFactory.get(viewModelScope)
    val actionsUiModel = actionsUiModelFactory.get()

    fun initialize(numRectangles: Int) {
        if (!isInitialized) {
            isInitialized = true
            summaryUiModel.numRectangles.set(numRectangles)
        }
    }
}
