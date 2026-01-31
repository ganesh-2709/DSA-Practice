package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static String longestSubString(String str) {
        int left=0;
        int right=0;
        int max=0;
        int start=0;
        Set<Character> set= new HashSet<>();

        while (right < str.length()){
        char ch=   str.charAt(right);

            if(!set.contains(ch)){
                set.add(ch);
                if(right-left + 1 > max){
                    max=right-left+1;
                    start=left;
                }

                right++;
            }
            else {
                set.remove(str.charAt(left));
                left++;
            }

        }

        // to know the characters which are unique
        return str.substring(start, start + max);
    }

    public static void main(String[] args) {
        String s="abcabcba";
        System.out.println(longestSubString(s));
    }
}
