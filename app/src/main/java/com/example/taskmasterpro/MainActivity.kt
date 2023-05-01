package com.example.taskmasterpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hacer el menu el fragment principal
        supportFragmentManager.beginTransaction().replace(R.id.nav_container, Menu()).commit()
    }


}