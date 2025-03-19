package com.krishna.threads;

//public class Threads {
//	public static void main(String[] args) {
//	}
//}

class MyThread extends Thread {
	public void run() {
		System.out.println("Runnable thread is running");
	}
}

class MyThread2 implements Runnable {
	public void run() {
		System.out.println("MyThread2 class is running");
	}
}

class Hi extends Thread {	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class Threads {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println(name);
		System.out.println("Hello, World!");

		MyThread m1 = new MyThread();
		m1.start();

		MyThread2 m2 = new MyThread2();
		Thread t1 = new Thread(m2);
		t1.start();

		Hi hi = new Hi();
		Hello hello = new Hello();

		hi.start();
		hello.start();
	}

}
