package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted elements: " + subList);
    }
}