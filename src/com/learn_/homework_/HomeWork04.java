package com.learn_.homework_;

public class HomeWork04 {
    public static void main(String[] args) {
        double a=100000;
        int b=0;
        while(a>1000){
            if(a>50000){
                a=a-a*0.05;
            }else {
                a=a-1000;
            }
            b=b+1;
        }
        System.out.println(b+"\t"+a);
    }
}
