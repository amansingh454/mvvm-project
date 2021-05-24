package com.example.project2.data.repository

import com.example.project2.data.network.MovieApi

class MainRepository constructor(private val movieApi: MovieApi){

    fun getAllMovies() =movieApi.getAllMovies()
}