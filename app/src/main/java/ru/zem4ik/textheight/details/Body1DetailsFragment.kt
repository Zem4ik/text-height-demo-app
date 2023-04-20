package ru.zem4ik.textheight.details

import android.graphics.Paint
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.zem4ik.textheight.R
import ru.zem4ik.textheight.databinding.FragmentFontDetailsBinding

class Body1DetailsFragment: FontDetailsFragment() {

    override val title: String
        get() = getString(R.string.body1)

    override fun getPaint()= Paint().apply {
        typeface = Typeface.create("sans-serif", Typeface.NORMAL)
        textSize = 17f
    }
}