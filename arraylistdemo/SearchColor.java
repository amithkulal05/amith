package com.arraylistdemo;

import java.util.ArrayList;

public class SearchColor {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        if (colors.contains("Red")) {
            System.out.println("Red color is available");
        } else {
            System.out.println("Red color is NOT available");
        }
    }
}