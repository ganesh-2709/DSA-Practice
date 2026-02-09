package com.java.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChar {

    // using map interface is more optimized
    public static void usingMapInterface(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // using stream is slightly slower
    public static void usingStream(String str){
        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors
                        .groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" : "+v));
    }
    public static void main(String[] args) {
        String str="abcabce";
        usingMapInterface(str);
        System.out.println("=====================");
        usingStream(str);
    }
}
