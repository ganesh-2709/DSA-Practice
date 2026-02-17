package com.java.dsa;

public class ReverseString {

    public static void reverseWord(String str) {

        // in this approach used split method
        String[] split = str.split(" ");
        for (String s : split) {
            StringBuilder rev = new StringBuilder(s).reverse().append(" ");
        System.out.print(rev); // avaj si a gnimargorp egaugnal
        }
        System.out.println();

        // without split method, this is best approach
        StringBuilder result=new StringBuilder();
        StringBuilder word=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word.append(ch);
            }else {
                result.append(word.reverse()).append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        System.out.println("other approach " +result);
    }

    public static void main(String[] args) {
        String str="java is a programing language";
        reverseWord(str);
    }
}
