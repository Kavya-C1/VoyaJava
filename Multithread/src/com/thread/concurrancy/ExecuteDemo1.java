package com.thread.concurrancy;

import com.thread.basics.Booking;
import com.thread.basics.Greetings;

import java.awt.print.Book;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //creating independent tasks
        executorService.execute(()->{
            System.out.println("Doing polling");
            //call Greetings class
            Greetings greet = new Greetings();
            greet.sayHello("Kavya");

        });
        executorService.execute(()->{
            //call the task of booking tickets
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Sri",20));
        });
        executorService.execute(()->{
            System.out.println("Reading from DB");
            //call the method of DbConnector class
        });
    }
}
