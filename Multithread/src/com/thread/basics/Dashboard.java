package com.thread.basics;

public class Dashboard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        //counter for 3 people
        Counter counter1 = new Counter("Tom",10,booking);
        Counter counter2= new Counter("Sam",10,booking);
        Counter counter3 = new Counter("John",10,booking);


    }
}
