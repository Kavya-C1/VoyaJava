package com.thread.basics;

public class Counter implements Runnable {
    String name;
    int noOfTickets;
    Booking booking;

    public Counter(String name, int noOfTickets, Booking booking) {
        super();
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        Thread t = new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {

//            System.out.println("Welcome to ABC Threates " + name);
//            double amount = booking.bookTickets(name, noOfTickets);
//            System.out.println("Amount to be paid " + amount);
//            System.out.println(" ");

        synchronized (booking) {
            System.out.println("Welcome to ABC Threates " + name);
            double amount = booking.bookTickets(name, noOfTickets);
            System.out.println("Amount to be paid " + amount);
            System.out.println(" ");
        }
    }
}
