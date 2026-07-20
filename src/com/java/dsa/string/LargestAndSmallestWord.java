package com.java.dsa.string;

import java.util.Scanner;

public class LargestAndSmallestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String largest = words[0];
        String smallest = words[0];

        for (String word : words) {

            if (word.length() > largest.length()) {
                largest = word;
            }

            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }

        System.out.println("Largest Word: " + largest);
        System.out.println("Smallest Word: " + smallest);
    }
}