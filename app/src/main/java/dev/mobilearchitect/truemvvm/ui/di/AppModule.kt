package dev.mobilearchitect.truemvvm.ui.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import dev.mobilearchitect.truemvvm.ui.base.di.AppContext
import dev.mobilearchitect.truemvvm.ui.base.di.ViewModelFactoryModule
import dev.mobilearchitect.truemvvm.ui.main.di.MainActivityBuilderModule
import javax.inject.Singleton

@Module(
    includes = [
        ViewModelFactoryModule::class,
        AndroidSupportInjectionModule::class,
        MainActivityBuilderModule::class
    ]
)
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    @AppContext
    fun provideContext(): Context = application
}