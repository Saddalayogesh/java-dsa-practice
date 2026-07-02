package com.java.dsa.array;

public class SecondSmallestElement {
    public static void main(String[] args) {

        int[] arr = {15, 8, 22, 4, 10, 6};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Smallest Element = " + secondSmallest);
    }
}
