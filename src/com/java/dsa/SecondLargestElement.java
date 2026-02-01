package com.java.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondLargestElement {
    public static int findSecondLargestElement(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(secondMax);
        for (int n : arr) {
            if (n > max) {
                secondMax = max;
                max = n;

            } else if (n < max && n > secondMax) {
                secondMax = n;
            }
        }

        if (secondMax == Integer.MIN_VALUE)
            throw new RuntimeException("no record found");
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 89, 34, -5, 67};

        // Using Stream API
        Optional<Integer> first = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first);

        OptionalInt first1 = Arrays.stream(arr).distinct().sorted().skip(arr.length - 2).findFirst();
        System.out.println(first1);

        // Using Method
        System.out.println(findSecondLargestElement(arr));
    }
}
