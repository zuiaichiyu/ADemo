package com.alex.app.algorithm


/**
 * 对角线之和的差值
 */
object DiagonalDifference {


    fun test(){

    }


    /**
     * 1 2 3 4
     * 4 5 6 5
     * 9 8 9 5
     * 5 6 7 8
     */
    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        // Write your code here
        var sumA = 0
        var subB = 0
        val n = arr.size
        arr.forEachIndexed { i, innerArray ->
            sumA += innerArray[i]
            subB += innerArray[n - i - 1]
        }
        return Math.abs(sumA - subB)
    }

}