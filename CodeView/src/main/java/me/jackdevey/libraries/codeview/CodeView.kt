package me.jackdevey.libraries.codeview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CodeView : RecyclerView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle)

    var fontSize: Float = 14f
    var code: String = "No code provided"

    fun show() {
        val data : MutableList<Line> = mutableListOf()
        for ((i, line) in code.lines().withIndex()) {
            data.add(Line(i, line))
        }
        this.adapter = LineAdapter(data, fontSize)
        this.layoutManager = LinearLayoutManager(context)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}