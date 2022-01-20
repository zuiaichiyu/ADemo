package com.alex.app.algorithm;

import java.util.Stack;

public class Balance {

    public static String isBalanced(String s) {

        if (s.length() == 0 || s.length() % 2 != 0) return String.valueOf(false);
        char[] array = s.toCharArray();
        Stack<String> resultStack = new Stack<>();

        for (int index = 0; index < array.length; index++) {
            char current = array[index];
            if (index == 0) {
                resultStack.push(String.valueOf(current));
                continue;
            }

            if (resultStack.isEmpty()) {
                resultStack.push(String.valueOf(current));
                continue;
            }

            String top = resultStack.peek();
            String pair = top + current;
            if (pair.equals("()") || pair.equals("{}")) {
                resultStack.pop();
            } else {
                resultStack.push(String.valueOf(current));
            }
        }

        return String.valueOf(resultStack.isEmpty());
    }


}
