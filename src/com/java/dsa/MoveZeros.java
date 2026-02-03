package com.java.dsa;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 2, 6, 0, 8, 0, 6 };  // op: [1, 5, 2, 6, 8, 6, 0, 0, 0]
        int temp=0;

        for(int i=0;i<=arr.length-1;i++){
           if(arr[i]!=0){
               arr[temp++]=arr[i];
           }
        }

        while (temp < arr.length){
            arr[temp++]=0;

        }
        System.out.println(temp);
        System.out.println(Arrays.toString(arr));

    }
}
