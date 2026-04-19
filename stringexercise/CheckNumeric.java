package com.stringexercise;

public class CheckNumeric {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String str = "12345";

        if (isNumeric(str)) {
            System.out.println("String is numeric");
        } else {
            System.out.println("String is not numeric");
        }
    }
}