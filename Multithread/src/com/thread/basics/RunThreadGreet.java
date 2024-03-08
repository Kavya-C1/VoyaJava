package com.thread.basics;
class Runner1 implements Runnable{

    String name;
    Greetings greetings;
    public Runner1(String name, Greetings greetings){
        Thread t = new Thread(this,name);
        this.name = name;
        this.greetings = greetings;
        t.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("Done");
        }
    }
}

public class RunThreadGreet {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner1 runner1 = new Runner1("Ram",greetings);
        Runner1 runner2 = new Runner1("Tom", greetings);
        Runner1 runner3 = new Runner1("sam", greetings);
        Runner1 runner4 = new Runner1("John", greetings);
//        Thread thread1 = new Thread(runner,"Thread-one");
//        Thread thread2 = new Thread(runner,"Thread-two");
//        thread1.start();
//        thread2.start();
    }
}
