package com.example.myappiiii.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myappiiii.SharedViewModel
import com.example.myappiiii.databinding.FragmentDetailBinding


class Detail : Fragment() {
    lateinit var binding: FragmentDetailBinding

    // private val args: DetailArgs by navArgs()
    private val viewModel: SharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.subCategory.observe(viewLifecycleOwner) { subcategory ->
            subcategory?.let {
                binding.detailIV.setImageResource(it.image)
                binding.NameSubcatTV.text = it.name
                binding.descriptionTV.text = it.description
                binding.subCategoryPriceTV.text = String.format("%.2f €", it.price)
            }
        }


        //Zurück zu letze layout (Subcategory)
        binding.backIV.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}