package com.objects.basic;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Karvalo","Tejaswi",400,"Fiction");
        Book book2 = new Book("Runa","Sudha murthy",600,"Fiction");

        book1.getDetails();
        String bookType1 = book1.checkBookType();
        System.out.println(book1.title + "is " + bookType1);

        book2.getDetails();
        String bookType2 = book2.checkBookType();
        System.out.println(book2.title + "is " + bookType2);



    }
}
