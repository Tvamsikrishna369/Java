package com.krishna.threads;


class MyTask implements Runnable {
	public void run() {
		
		for(int i=0; i<500; i++) {
			Thread.currentThread();
			if(Thread.interrupted()) {
				System.out.println("Thread intrrupted. Stopping the thread");
				break;
			}
			System.out.println("T ");
		}
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}
	
}

public class Thread2Demo {

	public static void main(String[] args) {

//		Thread curThread = Thread.currentThread();
//		int priority = curThread.getPriority();
//		System.out.println(priority);
		
//		ThreadGroup myGroup = new ThreadGroup("MyTGroup;");
//		myGroup.setMaxPriority(4);
//		Thread t2 = new Thread(myGroup, new MyTask(),"MyThread");
//		t2.start();
//		
//		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//		threadGroup.list();
//		
//		ThreadGroup parent = threadGroup.getParent(); //It will show the all System Threads
//		parent.list();
		
		
		Thread t1 = new Thread(new MyTask());
//		t1.setPriority(10);
//		t1.setDaemon(true);
		t1.start();
		
		for (int i=0; i<200; i++) {
			System.out.println("M ");
		}
		
		t1.interrupt(); //if we need to stop thread use this command..
		
	}

}
