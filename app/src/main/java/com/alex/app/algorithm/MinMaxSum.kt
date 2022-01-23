package com.alex.app.algorithm

object MinMaxSum {


    /**
     * 数组的最大和 最小和
     */
    fun miniMaxSum(arr: Array<Int>): Unit {
        // Write your code here
        arr.sort()
        var bigSum = 0L
        var smallSum = 0L

        arr.forEachIndexed { index, i ->

            if (index != 0) {
                bigSum += i
            }

            if (index != arr.lastIndex) {
                smallSum += i
            }
        }

        System.out.println("$smallSum $bigSum")
    }

}