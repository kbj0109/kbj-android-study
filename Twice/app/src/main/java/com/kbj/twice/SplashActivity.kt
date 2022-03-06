package com.kbj.twice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // manifests 폴더의 AndroidManifest.xml 파일에 Intent-filter 가 옮겨지면서, 
        // 이게 먼저 실행된다
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000)
    }
}