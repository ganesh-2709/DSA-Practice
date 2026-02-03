package com.java.dsa;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 3, 7, 1};
        int target = 8;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            int temp = target - i; // 6, -1, 3, 5
            set.add(i); //2, 7, 5, 3
            if (set.contains(temp)) {
                System.out.println(temp + " " + i); //5 3 = 8
                break;
            }
        }


        Arrays.sort(nums);
        Set<List<Integer>> set1 = new HashSet<>();
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int temp = nums[s] + nums[e];
            if (temp == target) {
                set1.add(Arrays.asList(nums[s], nums[e]));
                s++;
                e--;
            } else if (temp < target) s++;
            else e--;
        }
        System.out.println(set1);
    }
}