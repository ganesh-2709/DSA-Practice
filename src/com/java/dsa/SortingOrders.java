package com.java.dsa;

import java.util.Arrays;

public class SortingOrders {

    public static void insertionSorting(int[] arr){

        for(int i =1;i<arr.length;i++){
          int key=arr[i];
          int j=i-1;
//          while (j>=0 && arr[j] < key){  Descending Order
          while (j>=0 && arr[j] > key){  //Ascending Order
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int ver = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[ver]) {
                    ver = j;
                }
            }
            int temp = arr[ver];
            arr[ver] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr={21,10,8,45,4,6,24,56};
        insertionSorting(arr);
        selectionSort(arr);
        bubbleSort(arr);
    }
}
