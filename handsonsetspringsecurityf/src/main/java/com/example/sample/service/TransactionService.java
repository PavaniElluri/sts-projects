package com.example.sample.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.bean.Account;
import com.example.sample.bean.TransactionHistory;
import com.example.sample.repo.TransactionHistoryrepo;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionHistoryrepo repo;

    // Save a new Transaction
    public TransactionHistory saveTransaction(TransactionHistory transactionHistory) {
        return repo.save(transactionHistory);
    }

 // Get Transaction by ID
    public TransactionHistory getTransactionById(int transactionId) {
        return repo.findById(transactionId).orElse(null);
    }
    public List<TransactionHistory> getAll(){
    	return repo.findAll();
    }
    
    
    

    }


