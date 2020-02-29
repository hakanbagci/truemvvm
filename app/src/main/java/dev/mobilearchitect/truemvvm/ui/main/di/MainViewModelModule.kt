package dev.mobilearchitect.truemvvm.ui.main.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.mobilearchitect.truemvvm.ui.base.di.ViewModelKey
import dev.mobilearchitect.truemvvm.ui.main.home.HomeViewModel
import dev.mobilearchitect.truemvvm.ui.main.list.RectangleListViewModel

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RectangleListViewModel::class)
    abstract fun bindMainViewModel(viewModel: RectangleListViewModel): ViewModel
}