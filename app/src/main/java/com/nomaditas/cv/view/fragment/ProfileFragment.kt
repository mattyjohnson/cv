package com.nomaditas.cv.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.nomaditas.cv.R
import com.nomaditas.cv.view.widget.CircleTransform
import com.nomaditas.cv.viewmodel.ProfileViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_profile.*
import org.koin.android.viewmodel.ext.android.viewModel

class ProfileFragment : Fragment() {
    private val model: ProfileViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.getProfile().observe(this, Observer {
            Picasso.with(context).load(it.photoUrl).transform(CircleTransform()).into(imageProfile)
            textName.text = it.name
            textProfile.text = it.profile
            textPhoneNumber.text = it.phoneNumber
            textEmail.text = it.email
            textLinkedIn.text = it.linkedIn
            textVisaStatus.text = it.visaStatus
            textAvailability.text = it.availability
            progressBar.visibility = View.GONE
        })
    }
}
