package com.example.deadlock;

public class DeadLock {
	public static void main(String []args) {
	DThread1 t1=new DThread1();
	DThread2 t2=new DThread2();
	t1.start();
	t2.start();
	}
}
