package ru.zem4ik.textheight.variants.body2

import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.navigateTo
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment

class Body2VariantsNavigationFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.body2_variants_screen)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.first_variant) { navigateTo(FirstVariantFragment()) },
    )
}
