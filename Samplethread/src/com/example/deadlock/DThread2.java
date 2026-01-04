package com.example.deadlock;



public class DThread2 extends Thread {
	public void run() {
		synchronized (Util.s1) {
			System.out.println("s2 lock");

			synchronized (Util.s2) {
				System.out.println("s3 lock");

				synchronized (Util.s3) {
					System.out.println("s1 lock");
				}
				System.out.println("s2 is realised");
			}
			System.out.println("s3 is realised");
		}
		System.out.println("s1 is reailised");
	}

}
