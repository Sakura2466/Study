package com.learn_.homework_;

public class HomeWork07 {

    public static void main(String[] args) {

        double temp=0;
        for (int i = 1; i <=100; i++) {
            if(i%2!=0){
                temp+=1.0/i;
            }else{
                temp-=1.0/i;
            }
        }
        System.out.println(temp);
    }
}
