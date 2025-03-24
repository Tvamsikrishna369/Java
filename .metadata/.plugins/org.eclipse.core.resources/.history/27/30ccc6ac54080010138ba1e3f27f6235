package com.krishna.threads.sync;

class MyThread implements Runnable{
	
	Counter counter = new Counter();

	public void run() {
		
		for(int i=0; i<100; i++) {
			counter.increment();
		}
		
	}
	
	public int getCounter() {
		return counter.getCounter();
	}
	
}

public class MainForTest {
	
	public static void main(String[] args) {

		MyThread myThread = new MyThread();

		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(myThread.getCounter());	
			
	}

}
