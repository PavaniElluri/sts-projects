package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.bean.SwiftBank;
import com.example.sample.repo.Swift;

@Service
public class SwiftService {
	@Autowired
	private Swift repo;
	
	public String checkValidOrnot(SwiftBank bank) {
		try {
			repo.save(bank);
			return "input:"+bank.getSwiftCode()+"is valid";
		}
		catch(Exception e) {
			return "input:"+bank.getSwiftCode()+"is not valid";
		}
		
	}
	
	
	

}
