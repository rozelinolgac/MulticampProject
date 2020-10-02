package com.rozelinolgac.multicampproject

import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.View
import androidx.navigation.fragment.navArgs
import coil.load
import com.rozelinolgac.multicampproject.model.Article

import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.item_array.*


class secondFragment : Fragment(R.layout.fragment_second) {
   private val args by navArgs<secondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textViewName.text=args.dataC.name
        imageBanner.load(args.dataC.banner)
        imageLeader.load(args.dataC.leader?.photo)
        textDescription.text=args.dataC.description




    }
}