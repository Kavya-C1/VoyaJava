package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

import java.util.List;

public class Client {

    public static void main(String[] args) throws BookNotFoundException {
        IBookService bookService = new BookServiceImpl();

    }

}
