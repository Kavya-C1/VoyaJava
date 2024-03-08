package com.exception.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "Kavya";
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("close the connection");
        }
        System.out.println("completed");
    }
}
