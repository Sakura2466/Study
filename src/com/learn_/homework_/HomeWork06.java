package com.learn_.homework_;

public class HomeWork06 {
    public static void main(String[] args) {
        for (char i = 'a'; i <='z' ; i++) { //字符的本质是整数，所以可以运算。ASCII码
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
        }
    }
}
