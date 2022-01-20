package com.alex.app.algorithm

import java.util.*

object Decimals {

    fun plusMinus(arr: Array<Int>): Unit {
        // Write your code here

        if (arr.isNullOrEmpty()) return
        val total = arr.size

        var positive = 0
        var z = 0
        var negative = 0

        arr.forEach {
            if (it == 0) {
                z++
                return@forEach
            }
            if (it > 0) {
                positive++
                return@forEach
            }
            if (it < 0) {
                negative++
                return@forEach
            }
        }
        println(String.format(Locale.US, "%.6f", positive / total.toFloat()))
        println(String.format(Locale.US, "%.6f", z / total.toFloat()))
        println(String.format(Locale.US, "%.6f", negative / total.toFloat()))
    }
}