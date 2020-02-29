package dev.mobilearchitect.truemvvm.ui.main.home.summary

import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class SummaryUiModelFactory @Inject constructor() {

    fun get(coroutineScope: CoroutineScope) = SummaryUiModel(coroutineScope)
}