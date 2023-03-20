package com.example.myactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myactivityapp.databinding.ActivityTest1Binding
import com.example.myactivityapp.databinding.ActivityTest2Binding

class TestActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGoMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoTest1(view: View) {
        val intent = Intent(this, TestActivity1::class.java)
        startActivity(intent)
    }

    fun onClickClose(view: View) {
        finish()
    }
}