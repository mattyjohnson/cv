package com.nomaditas.cv.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nomaditas.cv.R
import kotlinx.android.synthetic.main.layout_skills.view.*

class SkillsAdapter(private var context: Context, private var skills: List<String>): RecyclerView.Adapter<SkillsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_skills, parent, false))
    }

    override fun getItemCount(): Int {
        return skills.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.skill.text = skills[position]
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var skill: TextView = view.text_skill
    }
}