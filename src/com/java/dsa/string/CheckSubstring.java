package com.java.dsa.string;

public class CheckSubstring {

    public static void main(String[] args) {

        String str = "Java Programming";
        String sub = "Program";

        if (str.contains(sub)) {
            System.out.println("Substring found.");
        } else {
            System.out.println("Substring not found.");
        }
    }
}