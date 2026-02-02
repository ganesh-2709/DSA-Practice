package com.java.dsa;

public class MaximumSumofSubArray {
    public static void main(String[] args) {

        // Subarray with maximum sum (Kadane’s Algorithm)
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max=arr[0];
        int sum=arr[0];
        int start=0,end=0;
        for(int i=0;i<arr.length-1;i++){
            sum=sum+arr[i];
            if(max < sum){
                max=sum;
                end=i;
            }
             if(sum < 0){
                 sum=0;
                 start=i+1;
            }
        }
        for(int i=start;i<end;i++)
            System.out.println(arr[i]);
        System.out.println(max);
    }
}
