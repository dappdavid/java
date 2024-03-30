package com.playground;

public class ThreadPractice extends Thread{
    @Override
    public void run() {
        System.out.println("In T1 thread");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        ThreadPractice t = new ThreadPractice();
        t.start();

        T2 t2 = new T2();
        t2.start();

        T3 t3 = new T3();
        Thread thread3 = new Thread(t3);
        thread3.start();

        //create and start a thread using java 8 features without needing a Thread class definition
        new Thread(() -> System.out.println("In T4 thread")).start();


        Thread.sleep(100);
        System.out.println("End of main thread");
    }


}

class T2 extends Thread {
    @Override
    public void run() {
        System.out.println("In T2 thread");
    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        System.out.println("In T3 thread");
    }
}
