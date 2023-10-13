package com.example.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.mobileprogramming.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val requestLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        Log.d("ITM","${it.resultCode}")
        Log.d("ITM", "${it.data?.getStringExtra("grade")}")
        Toast.makeText(this, it.data?.getStringExtra("grade"), Toast.LENGTH_SHORT).show()
    }
    val uriLauncher = registerForActivityResult(ActivityResultContracts.GetContent()){
        Log.d("ITM",it.toString())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("ITM", "onCreated Called!")
        val intent = Intent(this, SubActivity::class.java)
        binding.btnSay.setOnClickListener { requestLauncher.launch(intent) } //
        uriLauncher.launch("image/*")
    }

}


