package com.example.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.bean.Account;
import com.example.sample.bean.TransactionHistory;
import com.example.sample.repo.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repo;

	// Save a new Account
	public Account saveAccount(Account account) {
		return repo.save(account);
	}

	// Get Account by Account Number
	public Account getAccountByAccNum(int accNum) {
		return repo.findById(accNum).orElse(null);
	}

	// Get Accounts by Branch ID
	public List<Account> getAccountsByBranchId(String branchId) {
		return repo.findByBranchId(branchId);

	}

	// get all
	public List<Account> getAll() {
		return repo.findAll();
	}
}
