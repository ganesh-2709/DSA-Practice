package com.java.dsa;

import java.util.Arrays;

public class RotateArray {
    public static void rotateKPostiton(int[] arr, int k) {
        //first reverse given array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("first "+Arrays.toString(arr));

        //Now rotate first k elements
        end = k-1;
        start=0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("second "+Arrays.toString(arr));

        //Now again reverse remaining element
        start = k;
        end=arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1, 2, 3, 4, 5};
       rotateKPostiton(arr,k);
    }
}
