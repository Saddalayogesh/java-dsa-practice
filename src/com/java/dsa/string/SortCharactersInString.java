package com.java.dsa.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharactersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] characters = str.toCharArray();

        Arrays.sort(characters);

        String sortedString = new String(characters);

        System.out.println("Sorted String: " + sortedString);

        sc.close();
    }
}