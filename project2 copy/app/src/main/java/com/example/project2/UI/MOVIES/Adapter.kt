package com.example.project2.UI.MOVIES

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.Movie
import com.example.project2.R
import com.example.project2.databinding.SingleItemBinding

class Adapter (private val movies: List<Movie>, private val listener: recyclerViewClickListener):
        RecyclerView.Adapter <Adapter.MovieViewHolder>(){

    override fun getItemCount(): Int {
        return movies.size

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.single_item,parent,false))

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.singleItemBinding.movie=movies[position]
        holder.singleItemBinding.button.setOnClickListener {
            listener.onClickListener(holder.singleItemBinding.button,movies[position])
        }

    }

    inner class MovieViewHolder(val singleItemBinding: SingleItemBinding):
            RecyclerView.ViewHolder(singleItemBinding.root)

}


















