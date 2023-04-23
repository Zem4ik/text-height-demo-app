package ru.zem4ik.textheight.details

import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.navigateTo
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment

class FontNavigationFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.font_details)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.body1) { navigateTo(Body1DetailsFragment()) }
    )
}
