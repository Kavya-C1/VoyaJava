package com.list.custom;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public int compareTo(Book o) {

//        String tit = this.getTitle();
//        String tit1 = o.getTitle();
//        return this.getTitle().compareTo(o.getTitle());
//        return this.getAuthor().compareTo(o.getAuthor());
//        return this.getPrice().compareTo(o.getPrice());


        Double price = this.getPrice();
        return price.compareTo(o.getPrice());
//        return ((Double)this.getPrice()).compareTo(o.getPrice());



    }
}
