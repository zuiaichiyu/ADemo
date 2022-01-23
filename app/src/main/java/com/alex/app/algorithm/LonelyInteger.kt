package com.alex.app.algorithm

import java.util.*

object LonelyInteger {

    fun lonelyInteger(a: Array<Int>): Int {
        // Write your code here
        val stack = Stack<Int>()
        a.sort()
        a.forEach {
            if (stack.empty()) {
                stack.push(it)
                return@forEach
            }

            if (stack.peek() == it) {
                stack.pop()
            } else {
                stack.push(it)
            }
        }
        return stack.peek()
    }

}