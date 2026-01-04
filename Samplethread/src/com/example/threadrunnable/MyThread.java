package com.example.threadrunnable;

public class MyThread implements Runnable {
	
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("hi");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	
}




