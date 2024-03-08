package com.bookapp.client;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book category to find books");
        String userCategory = sc.next();
        IBookService bookService = new BookServiceImpl();

        List<Book> booksByCategory;

        try {
            booksByCategory = bookService.getByCategory(userCategory);
            for (Book book : booksByCategory) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
                    e.printStackTrace();
            }

            System.out.println("Find books by author");

            String userInputAuthor = sc.next();
            List<Book> booksByAuthor;

            try {
                booksByAuthor = bookService.getByAuthorStartsWith(userInputAuthor);
                for (Book book : booksByAuthor) {
                    System.out.println(book);
                }}catch (BookNotFoundException e){
                    e.printStackTrace();
                }
  }
}