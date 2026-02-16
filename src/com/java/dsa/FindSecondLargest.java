package com.java.dsa;

import java.util.Arrays;
import java.util.Comparator;


public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 89, 34, -5, 67 };

        //using Stream API
        Integer first = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(first); // 67

        //using traditional approach
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i:arr){
            if(i > largest){
                secondLargest=largest;
                largest=i;
            } else if(i > secondLargest && i != largest){
                secondLargest = i;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found");
        }

        System.out.println(secondLargest); // 67
    }
}
