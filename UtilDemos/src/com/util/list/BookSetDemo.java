package com.util.list;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","Kathy",300),
                new Book("Java","Kathy",700),
                new Book("5amClub","Robin",200),
                new Book("Leadership","Robin",600),
                new Book("Spring","Kathy",400),
                new Book("JSP&Servlets","Kathy",800)
        );

        System.out.println("List Book");
        for (Book book:books)
        {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Set Books");
//        Set<Book> bookSet = new LinkedHashSet<>(books);
        Set<Book> bookSet = new TreeSet<>(books);
        for (Book book:bookSet) {
            System.out.println(book);
        }

    }
}
