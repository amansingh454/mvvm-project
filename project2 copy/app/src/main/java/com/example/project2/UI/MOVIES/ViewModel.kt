package com.example.project2.UI.MOVIES

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project2.Movie
import com.example.project2.data.repository.MainRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response




class ViewModel constructor(private val repository: MainRepository) : ViewModel() {

    val movieList=MutableLiveData<List<Movie>>()
    val errorMessage=MutableLiveData<String>()

    fun getAllMovies() {
        val response = repository.getAllMovies()

        response.enqueue(object : Callback<List<Movie>> {
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                movieList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }

    }







