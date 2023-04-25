package ru.zem4ik.textheight.details

import android.graphics.Paint
import android.graphics.Typeface
import android.util.TypedValue
import ru.zem4ik.textheight.R

class Body1DetailsFragment : FontDetailsFragment() {

    override val title: String
        get() = getString(R.string.body1)

    override fun getPaint() = Paint().apply {
        typeface = Typeface.create("sans-serif", Typeface.NORMAL)
        val floatSize = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            17f,
            resources.displayMetrics
        )
        val res: Int = (if (floatSize >= 0) floatSize + 0.5f else floatSize - 0.5f).toInt()
        textSize = res.toFloat()
    }
}
