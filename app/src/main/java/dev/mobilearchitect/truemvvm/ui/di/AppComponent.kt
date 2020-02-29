package dev.mobilearchitect.truemvvm.ui.di

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import dev.mobilearchitect.truemvvm.ui.TrueMvvmApplication
import dev.mobilearchitect.truemvvm.ui.base.di.ViewModelFactoryModule
import dev.mobilearchitect.truemvvm.ui.main.di.MainActivityBuilderModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun inject(app: TrueMvvmApplication)
}