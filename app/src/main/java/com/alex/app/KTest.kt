package com.alex.app

import android.util.Log
import com.alex.app.algorithm.Balance
import com.alex.app.algorithm.Decimals
import com.alex.app.algorithm.DiagonalDifference
import com.alex.app.algorithm.Pop


object KTest {

    fun test() {
        mixType()
        Pop.test()
        Decimals.test()
        DiagonalDifference.test()
        Balance.isBalanced("{}{}{}()()}")
    }


    fun mixType() {
        val a = 0x000F
        val b = 0x2222

        Log.d("Test", "--> a&b=${a.and(b)}")

        val c = 1
        val b1 = c.toByte()
        val f = c.toFloat()
        val d = c.toDouble()
        val result = b1 + f + d
        Log.d("Test", "--> int+float+double=$result")

        // print  -->  test in B
        C().test()
    }
}


interface A {
    fun test()
}

open class B {

    fun test() {
        Log.d("Test", "--> test in B")
    }
}


class C : B(), A {
}