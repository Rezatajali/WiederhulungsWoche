package com.example.myappiiii.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myappiiii.R
import com.example.myappiiii.databinding.FragmentWelkommBinding


class Welkomm : Fragment() {
    lateinit var binding: FragmentWelkommBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelkommBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gastBTN.setOnClickListener {
            findNavController().navigate(R.id.home2)
        }

    }
}