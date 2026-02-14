package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeArraySum {
    public static void findThreeArraySum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i + 1;
            int r = arr.length - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == target) {
                    list.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    i++;
                    r--;

                    while (l < r && arr[l] == arr[l - 1]) l++;
                    while (l < r && arr[r] == arr[r - 1]) r--;
                } else if (sum > target) {
                    r--;
                } else l++;
            }
        }
        System.out.println(list); // this is where i have changed
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, -1, 0, 1, 2};
        int target = 0;
        Arrays.sort(arr);
        findThreeArraySum(arr, target);
    }
}
