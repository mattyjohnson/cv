package com.nomaditas.cv.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.nomaditas.cv.R
import com.nomaditas.cv.view.adapters.SkillsAdapter
import com.nomaditas.cv.viewmodel.SkillsViewModel
import kotlinx.android.synthetic.main.fragment_skills.*
import org.koin.android.viewmodel.ext.android.viewModel

class SkillsFragment : Fragment() {
    private val model: SkillsViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_skills, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.layoutManager = LinearLayoutManager(context)

        model.getSkills().observe(this, Observer {
            list.adapter = context?.let { it1 -> SkillsAdapter(it1, it) }
            progressBar.visibility = View.GONE
        })
    }
}
