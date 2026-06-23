package com.java.dsa.array;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}