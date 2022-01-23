package com.alex.app.algorithm

object NoPrefix {
    fun noPrefix(words: Array<String>): Unit {
        // Write your code here

        var resultString: String? = null
        words.forEach { w ->
            words.find {
                it != w && it.startsWith(w)
            }?.let {
                resultString = it
            }
        }

        if (resultString.isNullOrEmpty()) {
            System.out.println("GOOD SET")
            return
        }

        System.out.println("BAD SET")
        System.out.println(resultString)
    }


    /**
     * 左上部 四分之一矩阵的最大值
     */
    fun flippingMatrix(matrix: Array<Array<Int>>): Int {
        // Write your code here
        val n = matrix.size / 2
        var sum = 0

        matrix.forEachIndexed { rowIndex, rowArray ->

            rowArray.forEachIndexed { columnIndex, column ->
                if (columnIndex < n && rowIndex < n) {
                    sum += matrix[rowIndex][columnIndex]
                }
            }
        }
        return sum
    }

}