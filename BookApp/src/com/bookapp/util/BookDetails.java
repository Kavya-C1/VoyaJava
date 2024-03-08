package com.bookapp.util;



import com.bookapp.model.Book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookDetails {

    public static List<Book> showBooks() {
        return Arrays.asList(
                new Book("Java in Action", "John David","Tech",1,900.90),
        new Book("5am club", "Robin sharma","Self help",2,300.68),
        new Book("Html", "John David","Tech",3,1900.45),
        new Book("Secret Seven", "Enid Ben","Fiction",4,700.08),
        new Book("Seven habits", "John Hopper","SelfHelp",5,800.90)
        );

    }
}
