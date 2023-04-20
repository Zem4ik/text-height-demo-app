package ru.zem4ik.textheight

import ru.zem4ik.textheight.details.FontNavigationFragment
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment
import ru.zem4ik.textheight.variants.VariantsNavigationFragment

class MainFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.app_name)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.font_details) {
            navigateTo(FontNavigationFragment())
        },
        NavigationAdapter.Item(R.string.variants_screen) {
            navigateTo(VariantsNavigationFragment())
        }
    )
}