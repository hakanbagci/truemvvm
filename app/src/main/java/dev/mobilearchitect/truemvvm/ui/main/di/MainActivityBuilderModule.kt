package dev.mobilearchitect.truemvvm.ui.main.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.mobilearchitect.truemvvm.ui.base.di.ActivityScope
import dev.mobilearchitect.truemvvm.ui.main.MainActivity

@Module(includes = [MainViewModelModule::class])
abstract class MainActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainFragmentBuilderModule::class])
    abstract fun mainActivity(): MainActivity
}