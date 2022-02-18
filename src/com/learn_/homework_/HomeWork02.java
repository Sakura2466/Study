package com.learn_.homework_;



public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(new A02().find("aaa","bb","cc","aaa"));
    }
}

class A02{
    public int find(String str,String... strings){
        for (int i = 0; i < strings.length; i++) {
            if(str.equals(strings[i])){
                return i;
            }
        }
        return -1;
    }
}

