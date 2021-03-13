package me.jackdevey.libraries.codeview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.bandev.libraries.databinding.LineBinding

class LineAdapter(

    private val lines: MutableList<Line>,
    private val fontSize: Float

) : RecyclerView.Adapter<LineAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = LineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = lines[position]
        with(holder.lineText) {
            text = currentItem.lineText
            textSize = fontSize
        }
        with(holder.lineNumber) {
            text = currentItem.lineNumber.toString().padStart(3, '0')
            textSize = fontSize
        }
    }

    override fun getItemCount(): Int = lines.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding: LineBinding = LineBinding.bind(itemView)
        val lineNumber: TextView = binding.lineNumber
        val lineText: TextView = binding.lineText
    }
}