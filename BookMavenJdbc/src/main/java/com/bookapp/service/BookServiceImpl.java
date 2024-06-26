package com.bookapp.service;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Book> bookList = bookDao.findAll();
        return bookList;
    }

    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();
        for(Book book:books){
            if (book.getAuthor().startsWith(author)){
                bookByAuthor.add(book);
            }
        }
        if(bookByAuthor.isEmpty()){
            throw new BookNotFoundException("Book by this author not available");
        }
        return bookByAuthor;
    }

    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByCategory = new ArrayList<>();
        for(Book book:books){
            if (book.getCategory().equals(category)){
                bookByCategory.add(book);
            }
        }
        if( bookByCategory==null){
            throw new BookNotFoundException("book not found");
        }
        return  bookByCategory;
    }

    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByPrice = new ArrayList<>();
        for(Book book:books){
            if (book.getPrice()==price){
                bookByPrice.add(book);
            }
        }
        if(bookByPrice==null){
            throw new BookNotFoundException();
        }
        return bookByPrice;
    }

    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByAuthorAndCategory = new ArrayList<>();
        for(Book book:books){
            if (book.getAuthor().equals(author) && book.getCategory().equals(category)){
                bookByAuthorAndCategory.add(book);
            }
        }
        if(bookByAuthorAndCategory==null){
            throw new BookNotFoundException();
        }
        return bookByAuthorAndCategory;
    }

    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookById = new ArrayList<>();
        for(Book book:books){
            if (book.getBookId()==bookId){
//                newBook.add(book);
                return book;
            }
        }
        if(bookById==null){
            throw new IdNotFoundException();
        }
        return (Book) bookById;
    }
}
