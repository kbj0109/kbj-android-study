package com.kbj.dice_app

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.kbj.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,  R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 Go ! ", Toast.LENGTH_LONG).show()

            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            if(number1 ==1 ) {
                diceImage1.setImageResource(R.drawable.dice_1)
            }
            if(number1 ==2 ) {
                diceImage1.setImageResource(R.drawable.dice_2)
            }
            if(number1 ==3 ) {
                diceImage1.setImageResource(R.drawable.dice_3)
            }
            if(number1 ==4 ) {
                diceImage1.setImageResource(R.drawable.dice_4)
            }
            if(number1 ==5 ) {
                diceImage1.setImageResource(R.drawable.dice_5)
            }
            if(number1 ==6 ) {
                diceImage1.setImageResource(R.drawable.dice_6)
            }


        }
    }
}