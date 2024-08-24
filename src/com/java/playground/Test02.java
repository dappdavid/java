package com.java.playground;

class Thread1 extends Thread {

	public void run() {

		System.out.println("In Thread 1");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			i++;
			if (i == 1) {
				throw new RuntimeException();
			}
		}
	}

}

class Thread2 extends Thread {

	public void run() {
		System.out.println("In Thread 2");

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			i++;
		}

	}

}

public class Test02 {

	public static void main(String args[]) {

		Thread1 t1 = new Thread1();
		Thread t2 = new Thread2();

		try {
			t1.start();
			t1.join();
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally, t1.isAlive() - "+t1.isAlive());
		}

	}
}
