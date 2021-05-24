package com.example.project2.UI.MOVIES

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import com.example.project2.Movie
import com.example.project2.R

class SecondFragment : Fragment(), recyclerViewClickListener {
    var message:String?=""
    private lateinit var fragmentTransaction: FragmentTransaction
    private lateinit var movieFragment: MovieFragment
    private lateinit var recyclerViewClickListener: recyclerViewClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        message = arguments?.getString("data")
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.setText(message).toString()

        return view
    }

    override fun onClickListener(view: View, movie: Movie) {
        val button3 =view.findViewById<Button>(R.id.button3)
        when(view.id){
            R.id.button3 -> {
                recyclerViewClickListener.onClickListener(view, movie)
            }

}}}