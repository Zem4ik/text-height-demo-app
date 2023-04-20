package ru.zem4ik.textheight.variants

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.databinding.FragmentFirstVariantBinding

class FirstVariantFragment : Fragment(R.layout.fragment_first_variant) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFirstVariantBinding.bind(view)
        binding.toolbar.setNavigationOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
    }
}