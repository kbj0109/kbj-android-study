package com.kbj.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.btsImage1)
        var image2 = findViewById<ImageView>(R.id.btsImage2)
        var image3 = findViewById<ImageView>(R.id.btsImage3)
        var image4 = findViewById<ImageView>(R.id.btsImage4)
        var image5 = findViewById<ImageView>(R.id.btsImage5)
        var image6 = findViewById<ImageView>(R.id.btsImage6)
        var image7 = findViewById<ImageView>(R.id.btsImage7)

        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            var intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
        image2.setOnClickListener {
            var intent = Intent(this, BtsActivity2::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            var intent = Intent(this, BtsActivity3::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            var intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            var intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            var intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            var intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
    }
}