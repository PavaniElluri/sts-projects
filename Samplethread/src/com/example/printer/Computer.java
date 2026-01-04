package com.example.printer;

public class Computer extends Thread {
	Printer obj;
	String msg;
	public Computer(String msg, Printer obj) {
		super();
		this.obj = obj;
		this.msg = msg;
	}
	public void run() {
		obj.print(msg);
	}

}
