package com.java.dsa.string;

public class StringCompression {

    public static void main(String[] args) {
        String str = "aaabbccccdd";
        String result = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                result += count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
    }
}