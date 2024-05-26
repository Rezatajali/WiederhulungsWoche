package com.example.myappiiii.Data

import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import com.example.myappiiii.R

class DataSource {


    fun categories(): List<Category> {

        return listOf(

            Category("Gitarre", R.drawable.gitarr, listOf(
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Taylor Gitarr", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.git),
                Subcategory("Yamaha", "Pepperoni pizza with extra cheese", 9.99, R.drawable.gitarr))),

            Category("Piano", R.drawable.pianooo, listOf(
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Thomann Piano", "Taylor 214ce-N Black Dlx Nylon SE", 110.99, R.drawable.pianooo),
                Subcategory("Yamaha Piano", "Pepperoni pizza with extra cheese", 9.99, R.drawable.pianooo))),

            )

    }
}