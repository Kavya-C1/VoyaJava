package com.bookapp.dao;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class BookDaoImpl implements IBookDao {
    public void addBook(Book book) {
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY))
        {
            statement.setString(1,book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setDouble(3,book.getPrice());
            statement.setString(4,book.getCategory());
            statement.execute();

    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void updateBook(int bookId, double price) {

    }

    public void deleteBook(int bookId) {

    }

    public Book findById(int bookId) throws IdNotFoundException {
        return null;
    }

    public List<Book> findAll() {
        return null;
    }

    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> findByCategory(String category) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        return null;
    }

    public List<Book> findByAuthorCategory(String author, String Category) throws BookNotFoundException {
        return null;
    }
}
