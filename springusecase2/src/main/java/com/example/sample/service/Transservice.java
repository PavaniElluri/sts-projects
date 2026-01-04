package com.example.sample.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.bean.Transaction;
import com.example.sample.comparator.Comp;
import com.example.sample.repo.Transactionrepo;
//import com.example.sample.comparator.Comp;

@Service
public class Transservice {
	@Autowired
	private Transactionrepo repo;
	public void meth1(List<Transaction> trans) {
		repo.saveAll(trans);
	}
	public List<Transaction> getall() {
		List<Transaction> list=repo.findAll();//data from db
		Collections.sort(list,new Comp());
		return list;
		//return repo.findAll();
		}
	
}
