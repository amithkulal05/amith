package com.stringexercise;

public class P10 {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str = "Java is a powerful language";
        System.out.println("Word count: " + countWords(str));
    }
}