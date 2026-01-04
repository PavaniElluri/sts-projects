package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.bean.Transaction;
import com.example.sample.service.Transservice;

@RestController

public class TransactionController {
	@Autowired
	private  Transservice ser;
	@PostMapping("/save")
	public ResponseEntity <String> save(@RequestBody List<Transaction> trans) {
		ser.meth1(trans);
		return new ResponseEntity<>("data saved",HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public List<Transaction> get() {
		return ser.getall();
		
	}

}
