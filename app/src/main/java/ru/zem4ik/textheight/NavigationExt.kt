package ru.zem4ik.textheight

import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

fun Fragment.navigateTo(fragment: Fragment) {
    parentFragmentManager.commit {
        replace(R.id.container, fragment, null)
        addToBackStack(null)
    }
}
