package dev.mobilearchitect.truemvvm.ui.base.databinding

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.BindingAdapter

@BindingAdapter("isVisible")
fun View.isVisible(isVisible: Boolean) {
    this.visibility = if (isVisible) VISIBLE else GONE
}