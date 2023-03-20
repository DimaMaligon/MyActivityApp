package com.example.myactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myactivityapp.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val massage = intent.getStringExtra("nameScreen")
        binding.textScreenA1.text = massage
    }

    fun onClickGoMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("nameScreen" , "перешли с  TestActivity1")
        startActivity(intent)
    }

    fun onClickGoTest2(view: View) {
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }

    fun onClickAnswer(view: View) {
        intent.putExtra("name", binding.edField.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }

    fun onClickClose(view: View) {
        finish()
    }
}