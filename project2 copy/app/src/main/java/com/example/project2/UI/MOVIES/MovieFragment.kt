package com.example.project2.UI.MOVIES

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project2.*
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment(), recyclerViewClickListener {

    private lateinit var viewModel: ViewModel
    private lateinit var recyclerViewClickListener: recyclerViewClickListener
    private lateinit var fragmentTransaction: FragmentTransaction





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_movie, container, false)
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getAllMovies()
        viewModel.movieList.observe(viewLifecycleOwner, Observer { movieList->recview.also {
            it.layoutManager=LinearLayoutManager(requireContext())
            it.adapter= Adapter(movieList,recyclerViewClickListener)
        } })


    }

    override fun onClickListener(view: View, movie: Movie) {
        when(view.id){
            R.id.button -> {
                recyclerViewClickListener.onClickListener(view,movie)
            }

            }
        }

    }





