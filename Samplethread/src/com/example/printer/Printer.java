package com.example.printer;

public class Printer {
	/*public synchronized void print(String msg) {//here synchrnoized method its a method 
		System.out.println("printer started .... wait");
		for (int i = 0; i <= 10; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println("printer stopped");
	}*/
	public  void print(String msg) {//here synchrnoized method its a for particular code 
		System.out.println("printer started .... wait");
		synchronized(this) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		}
		System.out.println("printer stopped");
	}
}
