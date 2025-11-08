package prep.playground;

import org.junit.jupiter.api.Test;

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

    @Test
    public void testJoin() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> System.out.println("Thread t2 started"));

        t1.start();
        t1.join();
//        t1.interrupt();
        t2.start();
//        t2.start(); ->  IllegalThreadStateException
//        System.out.println(t1.isAlive());
//        System.out.println(t2.isAlive());

    }

    @Test
    public void testExceptionsAlive() {
        Thread t1 = null;
        try {
            t1 = new Thread(() ->
            {
                System.out.println("T1 started");
                try {
                    Thread.sleep(3000);
                    throw new RuntimeException();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

            t1.start();
            System.out.println("In try, T1 alive : " + t1.isAlive());
            throw new RuntimeException();

        } catch (Exception e) {
            System.out.println("In catch, T1 alive : " + t1.isAlive());
        } finally {
            System.out.println("In finally, T1 alive : " + t1.isAlive());
        }


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
