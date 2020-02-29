package dev.mobilearchitect.truemvvm.ui.main.di

import dagger.Module
import dagger.Provides
import dev.mobilearchitect.truemvvm.ui.base.di.ActivityScope
import dev.mobilearchitect.truemvvm.ui.main.MainActivity
import dev.mobilearchitect.truemvvm.ui.main.MainNavigator

@Module
class MainActivityModule {

    @ActivityScope
    @Provides
    fun provideNavigator(mainActivity: MainActivity) = MainNavigator(mainActivity)
}
