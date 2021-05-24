package com.example.project2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.UI.MOVIES.MovieFragment
import com.example.project2.UI.MOVIES.SecondFragment
import com.example.project2.UI.MOVIES.recyclerViewClickListener


class MainActivity : AppCompatActivity(), recyclerViewClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movieFragment= MovieFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment,movieFragment)
    }

    override fun onClickListener(view: View, movie: Movie) {
        val secondFragment= SecondFragment()
        val movieFragment= MovieFragment()
        if (view.id==R.id.button){
            val bundle=Bundle()
            bundle.putString("data",movie.cat)
            val transaction=this.supportFragmentManager.beginTransaction()
            secondFragment.arguments=bundle
            transaction.replace(R.id.fragment,secondFragment).addToBackStack(null).commit()
        }else
        {
            val transaction=this.supportFragmentManager.beginTransaction()
            transaction.replace(R.id.secondFragment,movieFragment).addToBackStack(null).commit()

        }







}}






