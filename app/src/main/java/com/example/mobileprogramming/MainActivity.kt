package com.example.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mobileprogramming.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ITM", "onCreated Called!")
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSay.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivityForResult(intent, 2021)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("ITM", "requestCode: $requestCode resultCode: $resultCode")
        Log.d("ITM", "${data?.getStringExtra("grade")}")
        Toast.makeText(this, data?.getStringExtra("grade"), Toast.LENGTH_SHORT).show()
    }
}


