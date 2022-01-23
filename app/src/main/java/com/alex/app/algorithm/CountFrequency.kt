package com.alex.app.algorithm

object CountFrequency {


    /**
     * 每个int 出现的频率的结果数组
     * 返回最多100个
     */
    fun countingSort(arr: Array<Int>): Array<Int> {
        // Write your code here
        val result = Array(Math.min(arr.size, 100)) { 0 }
        arr.forEachIndexed { index, i ->
            result[i] += 1
        }
        return result
    }
}