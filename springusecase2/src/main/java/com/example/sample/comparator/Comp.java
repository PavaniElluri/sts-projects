package com.example.sample.comparator;

import java.util.Comparator;

import com.example.sample.bean.Transaction;

public class Comp implements Comparator<Transaction>{
	private int getpriority(String type) {
		if("RTGS".equalsIgnoreCase(type)) return 3;
	
	if("IMPS".equalsIgnoreCase(type)) return 2;
	if("NEFT".equalsIgnoreCase(type)) return 1;
	return 0;
}
	public int compare(Transaction t1,Transaction t2) {
		int p1=getpriority(t1.getTransactionType());
		int p2=getpriority(t2.getTransactionType());
		
		if(p1!=p2) {
			return Integer.compare(p2, p1);
		}
		if(Double.compare(t1.getAmount(),t2.getAmount())!=0) {
			return Double.compare(t2.getAmount(), t1.getAmount());
		}
		return Long.compare(t1.getTimestamp(), t2.getTimestamp());
	}
		
	}
	
	

	


