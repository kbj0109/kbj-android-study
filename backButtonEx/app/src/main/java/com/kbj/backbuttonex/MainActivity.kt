package com.kbj.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Log.d("MainActivity", "back Button ~~~~")

        if(isDouble == true ) {
            finish() // 앱을 종료한다
        }
        isDouble = true
        Toast.makeText(this, "double click for exit", Toast.LENGTH_LONG).show()

        Handler().postDelayed({
            isDouble = false
        }, 1000)
    }
}