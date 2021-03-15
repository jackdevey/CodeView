package me.jackdevey.codeview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * The main CodeView element
 */
class CodeView : RecyclerView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle)

    /**
     * The font size of the text
     */
    var fontSize: Float = 14f

    /**
     * The code to display on the view
     */
    var code: String = "No code provided"

    /**
     * Number each line
     */
    var numberLines: Boolean = true

    /**
     * Show all the changes made
     */
    fun show() {
        val data : MutableList<Line> = mutableListOf()
        for ((i, line) in code.lines().withIndex()) {
            data.add(Line(i, line))
        }
        this.adapter = LineAdapter(data, fontSize, numberLines)
        this.layoutManager = LinearLayoutManager(context)
    }

    /**
     * Draw the element
     */
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}