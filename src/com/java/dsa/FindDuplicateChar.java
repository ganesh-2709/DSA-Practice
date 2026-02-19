package com.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateChar {

    public static void printUniqueChars(String str){
        str=str.replace(" ","").toLowerCase();

        // print unique values
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
                set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char s:set){
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static void printDuplicate(String str){

    }
    public static void main(String[] args) {
        String str="Java Programming";
        printUniqueChars(str);
        printDuplicate(str);
    }
}