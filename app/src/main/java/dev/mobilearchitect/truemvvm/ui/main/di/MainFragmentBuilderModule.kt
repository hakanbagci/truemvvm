package dev.mobilearchitect.truemvvm.ui.main.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dev.mobilearchitect.truemvvm.ui.base.di.FragmentScope
import dev.mobilearchitect.truemvvm.ui.main.home.HomeFragment
import dev.mobilearchitect.truemvvm.ui.main.list.ListFragment

@Module
abstract class MainFragmentBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun homeFragment(): HomeFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun listFragment(): ListFragment
}