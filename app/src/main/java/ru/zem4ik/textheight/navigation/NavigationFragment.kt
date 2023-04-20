package ru.zem4ik.textheight.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.databinding.FragmentNavigationBinding

abstract class NavigationFragment : Fragment(R.layout.fragment_navigation) {

    protected abstract val title: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentNavigationBinding.bind(view)
        binding.recycler.adapter = NavigationAdapter(getNavigationItems())
        binding.toolbar.setNavigationOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
    }

    abstract fun getNavigationItems(): List<NavigationAdapter.Item>
}