package dev.mobilearchitect.truemvvm.ui.main

import android.os.Bundle
import dev.mobilearchitect.truemvvm.R
import dev.mobilearchitect.truemvvm.ui.base.activity.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var mainNavigator: MainNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            mainNavigator.navigateToHome()
        }
    }
}
