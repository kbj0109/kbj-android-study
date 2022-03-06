package com.kbj.databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kbj.databinding_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*
        // findViewById를 사용한 데이터 바인딩
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener{
            Toast.makeText(this, "click - findViewById", Toast.LENGTH_LONG).show()
        }
        */

        // DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.testBtnId.setOnClickListener{
            Toast.makeText(this, "click - DataBinding", Toast.LENGTH_LONG).show()
        }
    }
}