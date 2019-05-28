package com.nomaditas.cv.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nomaditas.cv.R
import com.nomaditas.cv.network.Experience
import kotlinx.android.synthetic.main.layout_experience.view.*

class ExperienceAdapter(private var context: Context, private var experience: List<Experience>): RecyclerView.Adapter<ExperienceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_experience, parent, false))
    }

    override fun getItemCount(): Int {
        return experience.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.client.text = experience[position].client
        holder.dates.text = experience[position].dates
        holder.description.text = experience[position].description
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var client: TextView = view.text_client
        var dates: TextView = view.text_dates
        var description: TextView = view.text_description
    }
}