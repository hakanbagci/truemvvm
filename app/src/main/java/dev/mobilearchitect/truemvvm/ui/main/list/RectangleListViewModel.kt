package dev.mobilearchitect.truemvvm.ui.main.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.mobilearchitect.truemvvm.ui.main.list.rectangle.RectangleItemUiModel
import dev.mobilearchitect.truemvvm.ui.main.list.rectangle.RectangleItemUiModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class RectangleListViewModel @Inject constructor(
    private val rectangleItemUiModelFactory: RectangleItemUiModelFactory
) : ViewModel() {

    private var isInitialized = false

    private val mutableRectangleItems = MutableLiveData<List<RectangleItemUiModel>>()
    val rectangleItems: LiveData<List<RectangleItemUiModel>> = mutableRectangleItems

    fun initialize(numRectangles: Int) {
        if (!isInitialized) {
            isInitialized = true
            initRectangles(numRectangles)
        }
    }

    private fun initRectangles(numRectangles: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            mutableRectangleItems.postValue(
                (1..numRectangles).map {
                    rectangleItemUiModelFactory.get(
                        coroutineScope = viewModelScope,
                        index = it
                    )
                }
            )
        }
    }
}
