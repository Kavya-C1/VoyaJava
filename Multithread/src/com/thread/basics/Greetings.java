package com.thread.basics;

public class Greetings {
    public String sayHello(String name) {
        String result = null;
        try {
            System.out.println("Hi "+name);
            Thread.sleep(2000);
            result = "GreatDay " + name;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
