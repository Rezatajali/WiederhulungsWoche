package com.example.myappiiii.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myappiiii.Adapters.SubcategoryAdapter
import com.example.myappiiii.Data.DataSource
import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import com.example.myappiiii.R
import com.example.myappiiii.SharedViewModel
import com.example.myappiiii.databinding.FragmentSubCategoryBinding


class SubCategorys : Fragment() {

    lateinit var binding: FragmentSubCategoryBinding

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubCategoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        val onSubcategoryClick: (Subcategory) -> Unit = {

            viewModel.setSubCategory(subcategory = it)
            findNavController().navigate(R.id.detail)
        }


        viewModel.currentCategory.observe(viewLifecycleOwner) {
            binding.subRV.adapter = SubcategoryAdapter(subcategories = it)
        }

        val adapter = SubcategoryAdapter(data, onSubcategoryClick)
        binding.subRV.adapter = adapter














        //Zurück zu letze layout (Home)
        binding.backIV.setOnClickListener{
            findNavController().navigateUp()
        }

    }


}