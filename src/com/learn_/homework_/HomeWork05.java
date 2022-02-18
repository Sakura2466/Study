package com.learn_.homework_;

public class HomeWork05 {
    public static void main(String[] args) {

        for (int i = 1,j=0; i <=100 ; i++) {
            if(i%5!=0){
                j++;
                System.out.print(i+" ");
                if(j%5==0){
                    System.out.println();

                }
            }
            i++;
        }
    }
}
