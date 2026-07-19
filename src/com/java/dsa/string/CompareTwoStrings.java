package com.java.dsa.string;

public class CompareTwoStrings {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }


        if (str1.equalsIgnoreCase("JAVA")) {
            System.out.println("Strings are equal (ignoring case).");
        }
    }
}