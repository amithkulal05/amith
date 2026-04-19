package com.stringdemo;

import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("Java");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'a': " + text.indexOf('a'));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + text.replace('a', 'o'));

        // 7. Whitespace Handling
        String spaceStr = "   Hello Java   ";
        System.out.println("Trimmed: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        String concat = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String languages = "Java,Python,C++";
        String[] parts = languages.split(",");
        System.out.println("Split result: " + Arrays.toString(parts));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String name = "Amith";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);

        // 12. Email Validation
        String email = "amith@gmail.com";
        if (email.contains("@") && email.startsWith("a") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}