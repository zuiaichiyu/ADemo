package com.alex.app.jni

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class JNIDemoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, stringFromJNI(), Toast.LENGTH_SHORT).show()
    }


    /**
     * A native method that is implemented by the
     * 'hello-jni' native library, which is packaged
     * with this application.
     */
    private external fun stringFromJNI(): String?


    companion object {
        /*
         * this is used to load the 'hello-jni' library on application
         * startup. The library has already been unpacked into
         * /data/data/com.example.hellojni/lib/libhello-jni.so
         * at the installation time by the package manager.
         */
        init {
            System.loadLibrary("native-lib") // CPP
            // System.loadLibrary("hello-jni") // C
        }
    }
}