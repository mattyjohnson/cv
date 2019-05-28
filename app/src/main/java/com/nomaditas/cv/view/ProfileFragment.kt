package com.nomaditas.cv.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nomaditas.cv.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {
    private lateinit var model: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
    }

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
        })
    }
}
