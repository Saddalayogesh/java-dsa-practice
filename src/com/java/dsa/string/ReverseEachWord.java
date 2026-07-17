package com.java.dsa.string;

public class ReverseEachWord {

    public static void main(String[] args) {

        String sentence = "Java Full Stack";

        String[] words = sentence.split(" ");

        String result = "";

        for (String word : words) {

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            result += reverse + " ";
        }

        System.out.println("Original Sentence : " + sentence);
        System.out.println("Reversed Words    : " + result.trim());
    }
}