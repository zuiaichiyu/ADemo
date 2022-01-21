package com.alex.app

import android.util.Log


object KTest {


    fun test() {

        val a = 0x000F
        val b = 0x2222

        Log.d("test", "--> ${a.and(b)}")

        val c = 1
        val b1 = c.toByte()
        val f = c.toFloat()
        val d = c.toDouble()
        val result = b1 + f + d
        Log.d("test", "--> $result")

        C().test()
    }
}


interface A {
    fun test()
}

open class B {

    fun test() {
        Log.d("Test", "-->  test in B")
    }
}


class C : B(), A {
}