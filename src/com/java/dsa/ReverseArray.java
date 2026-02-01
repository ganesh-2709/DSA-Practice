package com.java.dsa;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseingArray(int[] arr) {
            int temp=0;
            int [] rev=new int[arr.length];

        // Using for loop to reverse array
        for (int i=arr.length-1;i>=0;i--) {
            rev[temp]=arr[i];
            temp++;
        }
        System.out.println(Arrays.toString(rev));  //[67, -5, 34, 89, 12, 45, 23]

        // Using while loop
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int i=arr[start];
            arr[start]=arr[end];
            arr[end]=i;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));  //[67, -5, 34, 89, 12, 45, 23]

    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 89, 34, -5, 67};
        reverseingArray(arr);
    }
}
