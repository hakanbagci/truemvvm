package dev.mobilearchitect.truemvvm.ui.base.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dev.mobilearchitect.truemvvm.ui.base.viewmodel.ViewModelFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}