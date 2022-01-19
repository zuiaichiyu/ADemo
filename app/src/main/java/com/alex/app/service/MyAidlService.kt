package com.alex.app.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import com.alex.app.IMyAidlInterface

class MyAidlService : Service() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent?): IBinder {
        return binder
    }


    private val binder = object : IMyAidlInterface.Stub() {

        override fun basicTypes(
            anInt: Int,
            aLong: Long,
            aBoolean: Boolean,
            aFloat: Float,
            aDouble: Double,
            aString: String?
        ) {
            Log.d("Service", "--> invoke from aidl service.")
            Toast.makeText(this@MyAidlService, "aidl method invoked", Toast.LENGTH_SHORT).show()
        }

    }


}