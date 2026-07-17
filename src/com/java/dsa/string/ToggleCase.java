package com.java.dsa.string;

public class ToggleCase {

    public static void main(String[] args) {

        String str = "JaVa ProGram";

        String result = "";

        for (char ch : str.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Toggled String : " + result);
    }
}