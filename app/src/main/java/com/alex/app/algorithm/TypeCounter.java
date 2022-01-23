package com.alex.app.algorithm;

public class TypeCounter {

    public static void typeCounter(String sentence) {

        String[] sArray = sentence.trim().split(" ");

        int stringCount = 0;
        int intCount = 0;
        int doubleCount = 0;

        for (String item : sArray) {
            if (item.isEmpty()) continue;

            if (isInteger(item)) {
                intCount++;
                continue;
            }

            if (isDouble(item)) {
                doubleCount++;
                continue;
            }

            stringCount++;
        }

        System.out.println("string " + stringCount);
        System.out.println("integer " + intCount);
        System.out.println("double " + doubleCount);
    }


    public static Boolean isInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Boolean isDouble(String s) {
        try {
            Double.valueOf(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
