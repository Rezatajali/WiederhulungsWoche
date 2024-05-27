package com.example.myappiiii.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myappiiii.Adapters.AdapterCategory
import com.example.myappiiii.Data.DataSource
import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import com.example.myappiiii.R
import com.example.myappiiii.SharedViewModel
import com.example.myappiiii.databinding.FragmentHomeBinding


class Home : Fragment() {

    lateinit var binding: FragmentHomeBinding

    private val viewModel: SharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = DataSource().categories()


        val onCategoryCkic: (Category) -> Unit = {
            //UI Event an ViewModel weitergeben
            viewModel.setCurrentCategory(it)

            //navigate to subCategory
            findNavController().navigate(R.id.subCategory)
        }

        val adapter = AdapterCategory(data, onCategoryCkic)

        binding.categoryRV.adapter = adapter



    }
}
