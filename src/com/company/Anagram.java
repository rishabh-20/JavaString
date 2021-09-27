package com.company;

public class Anagram {
    public static void main(String[] args) {


        String a="Cat";
        String b="aCt";
        boolean isAnagram=false;
        for(int i=0;i<a.length();i++) {
            char c = a.charAt(i);
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == c) {
                    isAnagram = true;
                    break;
                }
            }
        if(!isAnagram){
            break;
        }
        }
        if(isAnagram){
            System.out.println("Anagram");

        }else {
            System.out.println("Not Anagram");
        }
    }
}
