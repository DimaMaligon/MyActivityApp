package com.example.myactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myactivityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val massage = intent.getStringExtra("nameScreen")
        binding.textScreenA1.text = massage
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK) {
            binding.textName.text = "Your name : "  + data?.getStringExtra("name")
        }
    }

    fun onClickGoTest1(view: View) {
        val intent = Intent(this, TestActivity1::class.java)
        intent.putExtra("nameScreen", "перешли с  MainScreen")
        startActivityForResult(intent, 100)
    }

    fun onClickGoTest2(view: View) {
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }

    fun onClickClose(view: View) {
        finish()
    }
}