package com.java.dsa.string;

import java.util.Scanner;

public class CountOccurrencesOfSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Main String: ");
        String str = sc.nextLine();

        System.out.print("Enter Substring: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences: " + count);
    }
}