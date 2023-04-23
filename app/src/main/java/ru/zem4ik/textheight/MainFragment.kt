package ru.zem4ik.textheight

import ru.zem4ik.textheight.details.FontNavigationFragment
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment
import ru.zem4ik.textheight.variants.body1.Body1VariantsNavigationFragment
import ru.zem4ik.textheight.variants.body2.Body2VariantsNavigationFragment

class MainFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.app_name)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.font_details) {
            navigateTo(FontNavigationFragment())
        },
        NavigationAdapter.Item(R.string.body1_variants_screen) {
            navigateTo(Body1VariantsNavigationFragment())
        },
        NavigationAdapter.Item(R.string.body2_variants_screen) {
            navigateTo(Body2VariantsNavigationFragment())
        },
    )
}
