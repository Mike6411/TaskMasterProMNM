package com.example.taskmasterpro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.taskmasterpro.databinding.FragmentNewDailySheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class NewDailySheet : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentNewDailySheetBinding
    private lateinit var dailyViewModel: DailyViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment = requireParentFragment()
        dailyViewModel = ViewModelProvider(fragment).get(dailyViewModel::class.java)
        binding.saveButton.setOnClickListener {
            saveAction()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewDailySheetBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun saveAction()
    {
        dailyViewModel.name.value = binding.name.text.toString()
        dailyViewModel.desc.value = binding.desc.text.toString()
        binding.name.setText("")
        binding.desc.setText("")
        //treu la cosa del mitj
        dismiss()
    }






}