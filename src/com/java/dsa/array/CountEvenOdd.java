package com.java.dsa.array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}