package com.objects.basic;

public class Book {
    String title;
    String author;
    float price;
    String category;

    public Book(String title, String author, float price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }
    void getDetails()
    {
        System.out.println("titie" + this.title);
        System.out.println("author" + this.author);
        System.out.println("price" + this.price);
        System.out.println("category" + this.category);
    }

    String checkBookType(){
        if(price>500)
        {
            return "Premium Books";
        }
        else{
            return "Standard Books";
        }
    }

}
