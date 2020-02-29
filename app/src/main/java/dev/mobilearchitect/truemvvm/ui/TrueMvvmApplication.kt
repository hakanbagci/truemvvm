package dev.mobilearchitect.truemvvm.ui

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dev.mobilearchitect.truemvvm.ui.di.AppModule
import dev.mobilearchitect.truemvvm.ui.di.DaggerAppComponent
import javax.inject.Inject

class TrueMvvmApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }
}