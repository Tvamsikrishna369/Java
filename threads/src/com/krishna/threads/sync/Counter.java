//24/3/2025

package com.krishna.threads.sync;

public class Counter {
	
	int count = 0;
	public synchronized void increment() {
//		synchronized (this) {
//			count++;
//		}
		count++;
	}
	
	public int getCounter() {
		return count;
	}
	

}
