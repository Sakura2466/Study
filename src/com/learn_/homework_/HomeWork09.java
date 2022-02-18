package com.learn_.homework_;

public class HomeWork09 {
    public static void main(String[] args) {
        int n =10;
        int apple = aa(n);
        System.out.println(apple);
    }
    public static int aa(int n){
        if(n>1){

            return (aa(n-1)+1)*2;
        }else{
            return 1;
        }
    }

}
