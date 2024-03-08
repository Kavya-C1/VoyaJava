package com.thread.basics;
class Runner implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("done");
    }
}

public class RunThread {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner,"Thread-one");
        Thread thread2 = new Thread(runner,"Thread-two");
thread1.start();
thread2.start();
    }
}
