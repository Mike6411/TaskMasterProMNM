package com.example.taskmasterpro

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DailyViewModel: ViewModel()
{
    var name = MutableLiveData<String>()
    var desc = MutableLiveData<String>()
}