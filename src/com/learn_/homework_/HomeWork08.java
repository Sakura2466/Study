package com.learn_.homework_;

public class HomeWork08 {
    public static void main(String[] args) {
        int m = 0;
        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= i; j++) {
                m+= j;
            }

        }
        System.out.println(m);
    }
}

