package com.example.taskmasterpro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.taskmasterpro.databinding.FragmentDailyBinding

class Daily : Fragment() {

    private lateinit var binding: FragmentDailyBinding
    private lateinit var dailyViewModel: DailyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDailyBinding.inflate(layoutInflater)
        dailyViewModel = ViewModelProvider(this).get(DailyViewModel::class.java)
        binding.newTaskButton.setOnClickListener {
            NewDailySheet().show(parentFragmentManager, "newDailyTag")
        }

        dailyViewModel.name.observe(this){
            binding.taskName.text = String.format("Task Name: %s", it)
        }

        dailyViewModel.desc.observe(this){
            binding.taskDesc.text = String.format("Task Name: %s", it)
        }
    }
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