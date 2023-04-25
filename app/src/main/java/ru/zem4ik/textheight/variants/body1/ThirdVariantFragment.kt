package ru.zem4ik.textheight.variants.body1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.databinding.FragmentBody1ThirdVariantBinding

class ThirdVariantFragment : Fragment(R.layout.fragment_body1_third_variant) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentBody1ThirdVariantBinding.bind(view)
        binding.toolbar.setNavigationOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
    }
}
