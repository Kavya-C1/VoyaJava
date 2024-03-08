package com.thread.basics;

class Child1 extends Thread{

    public Child1(String name, int priority){
        super(name);
        System.out.println(this);
        this.start();
    }


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

public class ExThreadcons {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        Child1 child = new Child1();
        Child1 child1 = new Child1("child-one",10);
//        child1.setName("Child-One");
//        System.out.println(child1);
//        child1.start();

        Child1 child2 = new Child1("child-two",6);
        Child1 child3 = new Child1("child-three",8);
//        child2.setName("Child-two");
//        System.out.println(child2);
//        child2.start();
//        System.out.println();

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
        System.out.println("main completed");
    }
}
