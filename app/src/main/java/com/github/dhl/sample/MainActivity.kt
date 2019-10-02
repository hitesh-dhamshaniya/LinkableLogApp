package com.github.dhl.sample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.dhl.linkablelog.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("OnCreate", "Call from Main Activity")
        Log.i("OnCreate", "Call from Main Activity")
        Log.w("OnCreate", "Call from Main Activity")
        Log.d("OnCreate", "Call from Main Activity")
        Log.w("OnCreate", "Call from Main Activity")

        print()
    }

    fun dummyPrint(){
        print()
    }

    fun print(){
        Log.v("OnCreate ", "Main Activity")
    }

    fun printLog(view: View) {
        dummyPrint()

        Log.e("Hitesh", "Hello Main Activity")
        startService(Intent(MainActivity@ this, SampleService::class.java))
    }
}
