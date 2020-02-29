package dev.mobilearchitect.truemvvm.ui.main.progress

import androidx.databinding.ObservableBoolean

class ProgressUiModel {

    val isInProgress = ObservableBoolean(false)
}

fun ProgressUiModel.toProgress() = Progress(isInProgress.get())