package com.example.myappiiii

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myappiiii.Model.Category
import com.example.myappiiii.Model.Subcategory
import javax.sql.DataSource

class SharedViewModel: ViewModel() {

    val _subCategory = MutableLiveData<Subcategory>()
    val subCategory: LiveData<Subcategory>
        get() = _subCategory

    private val _currentCategory = MutableLiveData<Category>()
    val currentCategory: LiveData<Category>
        get() = _currentCategory

    fun setCurrentCategory(category: Category) {
        _currentCategory.value = category
    }

    fun setSubCategory(subcategory: Subcategory) {
        _subCategory.value = subcategory
    }











}