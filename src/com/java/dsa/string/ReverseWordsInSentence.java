package com.java.dsa.string;

public class ReverseWordsInSentence {

    public static void main(String[] args) {

        String sentence = "Java Full Stack Developer";
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}