package com.java.dsa.string;

import java.util.Scanner;

public class PrintPermutationsOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Permutations of the string:");
        printPermutations(str, "");

        sc.close();
    }

    public static void printPermutations(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            printPermutations(remaining, result + currentChar);
        }
    }
}