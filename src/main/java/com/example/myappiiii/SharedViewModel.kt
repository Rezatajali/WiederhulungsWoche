package com.example.myappiiii

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myappiiii.Model.Category
import javax.sql.DataSource

class SharedViewModel: ViewModel() {
   //val _categories : List<Category> = com.example.myappiiii.Data.DataSource().categories()
    private val _currentCategory = MutableLiveData<Category>()
    val currentCategory: LiveData<Category>
        get() = _currentCategory

    fun setCurrentCategory(category: Category) {
        _currentCategory.value = category
    }










}