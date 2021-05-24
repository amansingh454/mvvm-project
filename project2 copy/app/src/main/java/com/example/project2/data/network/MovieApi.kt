package com.example.project2.data.network

import com.example.project2.Movie
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MovieApi {
    @GET("movielist.json")

    fun getAllMovies(): retrofit2.Call<List<Movie>>

    companion object{
        var movieApi: MovieApi?=null

        fun getInstance(): MovieApi {
            if(movieApi ==null){
                val retrofit=Retrofit.Builder().baseUrl("https://howtodoandroid.com/movielist.json")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                movieApi =retrofit.create(MovieApi::class.java)

            }
            return movieApi!!
        }
    }
}

