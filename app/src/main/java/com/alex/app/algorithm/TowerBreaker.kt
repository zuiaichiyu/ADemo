package com.alex.app.algorithm

object TowerBreaker {


    /**
     * 奇偶数判断
     */
    fun towerBreakers(n: Int, m: Int): Int {
        // Write your code here
        return if (m != 1 && n % 2 == 1) 1 else 2
    }
}