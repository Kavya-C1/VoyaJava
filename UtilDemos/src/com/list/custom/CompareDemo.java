package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
//        List<Book> list = new ArrayList<>();
//        Book book1 = new Book("Java","Kathy",900);
//        Book book2 = new Book("Spring","Kathy",1900);
//        list.add(book1);

        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",900),
                new Book("Spring","Kathy",1900),
                new Book("Angular","John",500),
                new Book("Sql","Sam",800)
        );


        System.out.println("Before Sorting");
        for(Book book:books)
            System.out.println(book);

        System.out.println(" ");

        System.out.println("After Sorting");
        Collections.sort(books);
        for(Book book:books)
            System.out.println(book);
    }
}
