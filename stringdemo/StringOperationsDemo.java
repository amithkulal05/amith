package com.stringdemo;

import java.util.Arrays;

public class StringOperationsDemo {

    // 1. String Creation and Basic Operations
    public static void stringCreation() {
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
    }

    // 2. Length and Character Access
    public static void lengthAndChar(String str) {
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
    }

    // 3. String Comparison
    public static void compareStrings() {
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    public static void searchString(String str) {
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }

    // 5. Substring Operations
    public static void substringDemo(String str) {
        System.out.println("Substring (0,4): " + str.substring(0, 4));
    }

    // 6. String Modification
    public static void modifyString(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    // 7. Whitespace Handling
    public static void whitespaceHandling() {
        String str = "   Hello Java   ";
        System.out.println("Trimmed: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    public static void concatenation() {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Concatenation: " + str1.concat(" " + str2));
    }

    // 9. String Splitting
    public static void splitString() {
        String str = "Java,Python,C++";
        String[] parts = str.split(",");
        System.out.println("Split result: " + Arrays.toString(parts));
    }

    // 10. StringBuilder Demo
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        System.out.println("StringBuilder: " + sb);
    }

    // 11. String Formatting
    public static void stringFormatting() {
        String name = "Amith";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);
    }

    // 12. Email Validation
    public static void validateEmail(String email) {
        if (email.contains("@") && email.startsWith("a") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {

        stringCreation();

        String sample = "Java Programming";

        lengthAndChar(sample);
        compareStrings();
        searchString(sample);
        substringDemo(sample);
        modifyString(sample);
        whitespaceHandling();
        concatenation();
        splitString();
        stringBuilderDemo();
        stringFormatting();

        validateEmail("amith@gmail.com");
    }
}