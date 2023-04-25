package ru.zem4ik.textheight.variants.body1

import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.navigateTo
import ru.zem4ik.textheight.navigation.NavigationAdapter
import ru.zem4ik.textheight.navigation.NavigationFragment

class Body1VariantsNavigationFragment : NavigationFragment() {
    override val title: String
        get() = getString(R.string.body1_variants_screen)

    override fun getNavigationItems(): List<NavigationAdapter.Item> = listOf(
        NavigationAdapter.Item(R.string.first_variant) { navigateTo(FirstVariantFragment()) },
        NavigationAdapter.Item(R.string.second_variant) { navigateTo(SecondVariantFragment()) },
        NavigationAdapter.Item(R.string.third_variant) { navigateTo(ThirdVariantFragment()) },
        NavigationAdapter.Item(R.string.fourth_variant) { navigateTo(FourthVariantFragment()) },
    )
}
