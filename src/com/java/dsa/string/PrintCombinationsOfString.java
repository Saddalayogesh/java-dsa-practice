package com.java.dsa.string;

import java.util.Scanner;

public class PrintCombinationsOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Combinations of the string:");
        printCombinations(str, "", 0);

        sc.close();
    }

    public static void printCombinations(String str, String current, int index) {

        if (index == str.length()) {

            if (!current.isEmpty()) {
                System.out.println(current);
            }

            return;
        }


        printCombinations(str, current + str.charAt(index), index + 1);


        printCombinations(str, current, index + 1);
    }
}