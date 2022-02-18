package com.learn_.homework_;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {

        System.out.println(new A01().max(88.8,15.0,18.0,39.0));
    }
}
class A01{
    double maxDouble;

    public double max(double... doubles){
        Arrays.sort(doubles);
        return doubles[doubles.length-1];
    }
}
