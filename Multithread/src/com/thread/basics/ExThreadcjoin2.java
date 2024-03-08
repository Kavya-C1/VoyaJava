package com.thread.basics;

class Child3 extends Thread{

    public Child3(String name, int priority){
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

public class ExThreadcjoin2 {
    public static void main(String[] args) {

        Child3 child3 = new Child3("child-three",8);
        child3.setDaemon(true);
        child3.start();


        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

//        try{
//            child1.join();
//            child2.join();
//            child3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("main completed");
    }
}
