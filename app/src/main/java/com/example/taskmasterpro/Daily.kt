package com.example.taskmasterpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Daily : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_daily, container, false)
        val menuBtn : Button = view.findViewById(R.id.returnButton)
        menuBtn.setOnClickListener(){
            val fragment = Menu();
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()
        }
        return view
    }
}