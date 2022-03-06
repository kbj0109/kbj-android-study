package com.kbj.twice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        // Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if (getData == "1") {
            memberImage.setImageResource(R.drawable.member_1)
        }
        if (getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        }
        if (getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        }
        if (getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        }

    }
}