package ru.zem4ik.textheight

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView


class TextViewWithLines @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : MaterialTextView(context, attrs) {
    private val baselineColor = Color.RED
    private val topColor = Color.parseColor("#A7FD64")
    private val ascentColor = Color.parseColor("#80f3CA")
    private val descentColor = Color.parseColor("#FEEF68")
    private val bottomColor = Color.parseColor("#FDA464")
    private var paint = Paint()
    private val fontMetricsInt = super.getPaint().fontMetricsInt

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var currentLine = layout.getLineForVertical(scrollY)
        var lineBaseline = 0
        var lineTop = 0
        var lineBottom = 0
        var lineAscent = 0
        var lineDescent = 0

        fun recalculateLineParams() {
            lineBaseline = getLineBounds(currentLine, null)
            lineTop = lineBaseline + fontMetricsInt.top
            lineBottom = lineBaseline + fontMetricsInt.bottom
            lineAscent = lineBaseline + fontMetricsInt.ascent
            lineDescent = lineBaseline + fontMetricsInt.descent
        }

        recalculateLineParams()
        val lineLeft = 0f
        val lineRight = width.toFloat()

        paint.strokeWidth = 0f
        paint.isAntiAlias = false
        while (currentLine < lineCount && lineTop < bottom) {

            if (lineTop >= 0) {
                paint.color = topColor
                val lineTopFloat = lineTop.toFloat()
                canvas?.drawLine(lineLeft, lineTopFloat, lineRight, lineTopFloat, paint)
            }
            if (lineAscent >= 0) {
                paint.color = ascentColor
                val lineAscentFloat = lineAscent.toFloat()
                canvas?.drawLine(lineLeft, lineAscentFloat, lineRight, lineAscentFloat, paint)
            }
            if (lineBaseline in 0..height) {
                paint.color = baselineColor
                val lineBaselineFloat = lineBaseline.toFloat()
                canvas?.drawLine(lineLeft, lineBaselineFloat, lineRight, lineBaselineFloat, paint)
            }
            if (lineDescent <= height) {
                paint.color = descentColor
                val lineDescentFloat = lineDescent.toFloat() - 1f
                canvas?.drawLine(lineLeft, lineDescentFloat, lineRight, lineDescentFloat, paint)
            }
            if (lineBottom <= height) {
                paint.color = bottomColor
                val lineBottomFloat = lineBottom.toFloat() - 1f
                canvas?.drawLine(lineLeft, lineBottomFloat, lineRight, lineBottomFloat, paint)
            }

            currentLine++
            recalculateLineParams()
        }
//        getLineBounds()
    }

}
