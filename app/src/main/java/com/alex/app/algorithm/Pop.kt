package com.alex.app.algorithm

import android.util.Log

object Pop {

    fun test() {
        val popResult = pop(intArrayOf(2, 1, 8, 4, 9, 5, 6, 3, 0))
        popResult.forEach {
            Log.d("Pop", "$it")
        }
    }

    /***
     * 冒泡排序， 从小到大
     */
    fun pop(array: IntArray): IntArray {
        for (i in array.indices) {
            for (j in 0 until array.size - 1 - i) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }
}