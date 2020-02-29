package dev.mobilearchitect.truemvvm.ui.main

import androidx.fragment.app.Fragment
import dev.mobilearchitect.truemvvm.R
import dev.mobilearchitect.truemvvm.ui.main.home.HomeFragment
import dev.mobilearchitect.truemvvm.ui.main.list.ListFragment

class MainNavigator(private val mainActivity: MainActivity) {

    fun navigateToHome() {
        navigateToFragment(HomeFragment.newInstance())
    }

    fun navigateToRectangleList() {
        navigateToFragment(ListFragment.newInstance())
    }

    private fun navigateToFragment(fragment: Fragment) {
        mainActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.am_container, fragment)
            .commit()
    }
}