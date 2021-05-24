package com.example.project2.UI.MOVIES

import android.view.View
import com.example.project2.Movie

interface recyclerViewClickListener {

    fun onClickListener(view: View, movie: Movie)
}