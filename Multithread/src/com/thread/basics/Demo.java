package com.thread.basics;

class A implements  Runnable{
    @Override
    public void run() {
        System.out.println("Great Day");
    }
}

public class Demo {
    public static void main(String[] args) {
        Runnable task = ()->{
            System.out.println("Task1");
        };
        Thread thread = new Thread(task,"pop");
        Thread thread1 = new Thread(()->{
            System.out.println("Task2");
        },"top");
        thread.start();
        thread1.start();

        Thread t = new Thread(new A(),"a");
        Thread tt = new Thread(new A(),"ab");

    }

}
