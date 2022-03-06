package com.kbj.val_log_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value1 = "This is Value 11111"
        var value2 = "This is Value 2222"
        
        // value = "aaaa" // val 변수는 바꿀 수 없다
        
        value2 = "abcdef" // var 변수는 바꿀 수 있다



        val test = "This is Test Value Test Test Test Test"

        Log.e("Main Activity", test) // 오류
        Log.w("Main Activity", test) // 경고
        Log.i("Main Activity", test) // 정보
        Log.d("Main Activity", test) // 디버그
        Log.v("Main Activity", test) // 상세

        Toast.makeText(this, test, Toast.LENGTH_LONG).show()
    }
}