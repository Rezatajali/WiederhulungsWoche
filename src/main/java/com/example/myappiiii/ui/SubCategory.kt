package com.example.myappiiii.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myappiiii.Adapters.AdapterCategory
import com.example.myappiiii.Adapters.SubcategoryAdapter
import com.example.myappiiii.Data.DataSource
import com.example.myappiiii.R
import com.example.myappiiii.databinding.FragmentSubCategoryBinding


class SubCategory : Fragment() {

    lateinit var binding: FragmentSubCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val adapter = SubcategoryAdapter()
    }
}