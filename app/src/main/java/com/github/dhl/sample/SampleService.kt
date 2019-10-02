package com.github.dhl.sample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.github.dhl.linkablelog.Log

class SampleService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.e("Service", "Log in service")
    }
}
