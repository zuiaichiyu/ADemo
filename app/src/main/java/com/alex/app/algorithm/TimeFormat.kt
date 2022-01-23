package com.alex.app.algorithm

import java.text.SimpleDateFormat
import java.util.*

object TimeFormat {

    /**
     * 07:05:45PM -> 19:05:45
     * 12:01:00AM -> 00:01:00
     */
    fun timeConversion(s: String): String {
        // Write your code here

        val sdf = SimpleDateFormat("hh:mm:ssa", Locale.US)
        val sdfOut = SimpleDateFormat("HH:mm:ss", Locale.US)

        try {
            sdf.parse(s)?.let {
                return sdfOut.format(it)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }
}