package ru.zem4ik.textheight.variants

import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.navigateTo
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment

class VariantsNavigationFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.variants_screen)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.first_variant) { navigateTo(FirstVariantFragment()) },
        NavigationAdapter.Item(R.string.second_variant) { navigateTo(SecondVariantFragment()) }
    )
}