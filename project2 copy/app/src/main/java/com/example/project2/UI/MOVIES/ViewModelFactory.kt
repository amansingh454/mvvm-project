package com.example.project2.UI.MOVIES

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.project2.data.repository.MainRepository

class ViewModelFactory constructor(private val repository: MainRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ViewModel::class.java)) {
            ViewModelFactory(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }


    }
}