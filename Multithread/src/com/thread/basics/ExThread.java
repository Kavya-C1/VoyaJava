package com.thread.basics;

class Child extends Thread{

    //this is the cpu
    @Override
    public void run() {

//write logic to print 5th table 10 times

        for(int i=1; i<=10; i++){
//            System.out.println(Thread.currentThread().getName());
            String name = Thread.currentThread().getName();
            System.out.println("5*" + i + "=" + 5*i + name);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
//        Thread thread = new Thread();
        Child child1 = new Child();
        child1.setName("Child-One");
        System.out.println(child1);
        child1.start();

        Child child2 = new Child();
        child2.setName("Child-two");
        System.out.println(child2);
        child2.start();
        System.out.println();

        for(int i=1; i<=10; i++){
            String name = Thread.currentThread().getName();
//            System.out.println(Thread.currentThread().getName());
            System.out.println("5*" + i + "=" + 10*i +name );
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
