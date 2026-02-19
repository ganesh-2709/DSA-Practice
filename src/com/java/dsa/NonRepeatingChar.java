package com.java.dsa;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "swisse";

        Map<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
