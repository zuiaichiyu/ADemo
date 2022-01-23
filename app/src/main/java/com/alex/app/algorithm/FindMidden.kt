package com.alex.app.algorithm

object FindMidden {

    fun findMedian(arr: Array<Int>): Int {
        // Write your code here
        arr.sort()
        return arr[arr.lastIndex / 2]
    }

}