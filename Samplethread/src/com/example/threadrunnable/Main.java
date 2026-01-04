package com.example.threadrunnable;

import com.example.thread.SampleThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ms=System.currentTimeMillis();
		

		MyThread m1=new MyThread();
		Thread t1=new Thread(m1);
		t1.start();

	}

}
