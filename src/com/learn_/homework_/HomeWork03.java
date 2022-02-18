package com.learn_.homework_;

public class HomeWork03 {
    public static void main(String[] args) {
        Book book =new Book("java",80);
        book.info();
        book.updatePrice(2000);
        book.info();
    }
}

 class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        if(price>100&&price<150){
            this.price = 100;
        }else if (price>150){
            this.price = 150;
        }else{
            this.price=price;
        }

    }

    public void updatePrice(double d) {
        if (d > 100 && d < 150) {
            price = 100;
        } else if (d > 150) {
            price = 150;
        }
    }

     public void info() {
         System.out.println("书名="+name+"价格="+price);
     }
}