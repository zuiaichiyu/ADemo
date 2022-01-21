package com.alex.app.algorithm

object CompareTriplets {


    fun test() {

    }


    /**
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        // Write your code here
        var aTotal = 0
        var bTotal = 0
        if (a.size != b.size) return arrayOf(0, 0)

        for (index in a.indices) {
            if (a[index] == b[index]) {
                continue
            }
            if (a[index] > b[index]) {
                aTotal += 1
                continue
            }
            if (a[index] < b[index]) {
                bTotal += 1
                continue
            }
        }
        return arrayOf(aTotal, bTotal)
    }
}