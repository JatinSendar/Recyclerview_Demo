package com.example.recyclerviewdemo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val songs : List<Model>) :RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.sapmle_rv,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = songs[position].title
        holder.tvDesc.text = songs[position].desc
        var color = "#CCCCCC"
        if (position % 2 ==0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var tvDesc = itemView.findViewById<TextView>(R.id.tvDesc)
        var container =itemView.findViewById<LinearLayout>(R.id.container)
    }

}
