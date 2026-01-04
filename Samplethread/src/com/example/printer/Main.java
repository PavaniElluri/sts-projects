package com.example.printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p=new Printer();
		Computer c1=new Computer("one",p);
		Computer c2=new Computer("two",p);
		Computer c3=new Computer("three",p);
		c1.start();
		c2.start();
		c3.start();

	}

}
