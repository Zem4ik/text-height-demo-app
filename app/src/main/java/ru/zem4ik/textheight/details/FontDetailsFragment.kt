package ru.zem4ik.textheight.details

import android.graphics.Paint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.databinding.FragmentFontDetailsBinding

abstract class FontDetailsFragment : Fragment(R.layout.fragment_font_details) {

    protected abstract val title: String

    protected abstract fun getPaint(): Paint

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFontDetailsBinding.bind(view)
        binding.title.text = title
        val paint = getPaint()
        val fontMetrics = paint.fontMetrics
        val fontMetricsInt = paint.fontMetricsInt

        fun Float.round() = String.format("%.2f", this)

        binding.apply {
            topValue.text = "Top: ${fontMetrics.top.round()} (${fontMetricsInt.top})"
            bottomValue.text = "Bottom: ${fontMetrics.bottom.round()} (${fontMetricsInt.bottom})"
            ascentValue.text = "Ascent: ${fontMetrics.ascent.round()} (${fontMetricsInt.ascent})"
            descentValue.text =
                "Descent: ${fontMetrics.descent.round()} (${fontMetricsInt.descent})"
        }

        binding.toolbar.setNavigationOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
    }
}
