package dev.mobilearchitect.truemvvm.ui.base.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.mobilearchitect.truemvvm.ui.base.fragment.BaseFragment

inline fun <reified T : ViewModel> BaseFragment.withViewModel(body: T.() -> Unit): T {
    return ViewModelProvider(this, viewModelFactory)[T::class.java].apply(body)
}