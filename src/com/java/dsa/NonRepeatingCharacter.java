package com.java.dsa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void firstNonrepeatChar(String str){
        Map<Character, Integer> map=new LinkedHashMap<>();

        for(char s:str.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()); // output: w
                return;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter value :");
        String str = sc.next(); //ex: swesse
        firstNonrepeatChar(str);
    }
}
