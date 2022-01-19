package com.alex.app.service

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alex.app.IMyAidlInterface

class AidlDemoActivity : AppCompatActivity() {

    var aidlService: IMyAidlInterface? = null
    var connection: ServiceConnection? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        connection = object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                Log.d("Service", "--> AIDL service connected")
                aidlService = IMyAidlInterface.Stub.asInterface(service)
                aidlService?.basicTypes(1, 2, true, 1f, 1.4, "")
            }

            // This is called when the connection with the service has been
            // unexpectedly disconnected -- that is, its process crashed.
            override fun onServiceDisconnected(name: ComponentName?) {
                Log.d("Service", "--> AIDL service disconnected")
            }
        }

        val serviceIntent = Intent(this, MyAidlService::class.java)
        connection?.let { bindService(serviceIntent, it, Context.BIND_AUTO_CREATE) }
    }


    override fun onDestroy() {
        super.onDestroy()
        connection?.let { unbindService(it) }
    }
}