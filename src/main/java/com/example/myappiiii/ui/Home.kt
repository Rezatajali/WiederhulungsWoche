package com.example.myappiiii.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myappiiii.Adapters.AdapterCategory
import com.example.myappiiii.Data.DataSource
import com.example.myappiiii.R
import com.example.myappiiii.databinding.FragmentHomeBinding


class Home : Fragment() {

    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = AdapterCategory(DataSource().categories())
        binding.categoryRV.adapter = adapter

        binding.categoryRV.setOnClickListener{
            findNavController().navigate(R.id.subCategory)
        }
    }
}
