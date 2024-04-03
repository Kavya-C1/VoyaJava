package com.bookapp.dao;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookDao {

    void addBook(Book book); //create
    void updateBook(int bookId, double price); //update
    void deleteBook(int bookId); //delete
    Book findById(int bookId) throws IdNotFoundException; //retrieve

    List<Book> findAll();
    List<Book> findByAuthor(String author) throws BookNotFoundException;

    List<Book> findByCategory(String category) throws BookNotFoundException;
    List<Book> findByLesserPrice(double price) throws BookNotFoundException;
    List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException;
}
