package com.bookapp.service;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public class BookServiceImpl implements IBookService {

    private IBookDao bookDao = new BookDaoImpl();

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void updateBook(int bookId, double price) {
bookDao.updateBook(bookId,price);
    }

    public void deleteBook(int bookId) {
bookDao.deleteBook(bookId);
    }

    public List<Book> getAll() {
        return null;
    }

    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;
    }

    public Book getById(int bookId) throws BookNotFoundException {
        return null;
    }
}
