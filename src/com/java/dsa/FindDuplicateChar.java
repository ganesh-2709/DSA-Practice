package com.java.dsa;

import java.util.*;

public class FindDuplicateChar {

    public static void printUniqueChars(String str){
        str=str.replace(" ","").toLowerCase();

        // print unique values
        Set<Character> set=new LinkedHashSet<>();
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
        Set<Character> dup=new LinkedHashSet<>();
        Set<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
              if(!set.contains(ch)){
                  set.add(ch);
              }else{
                  dup.add(ch);
              }
        }
        System.out.println(dup);
    }

    public static void printFrequencyofChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String str="Java Programming";
        printUniqueChars(str);
        printDuplicate(str);
        printFrequencyofChar(str);
    }
}