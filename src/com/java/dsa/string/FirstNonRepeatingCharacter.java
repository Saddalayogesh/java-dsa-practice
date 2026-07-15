package com.java.dsa.string;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "sswiss";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non-Repeating Character: " + ch);
                break;
            }
        }
    }
}