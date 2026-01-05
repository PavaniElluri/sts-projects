package com.example.sample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.sample.bean.Account;
import com.example.sample.bean.TransactionHistory;
import com.example.sample.service.TransactionService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Save Transaction
    @PostMapping("/save")
    public ResponseEntity<TransactionHistory> saveTransaction(@Valid @RequestBody TransactionHistory transactionHistory) {
        TransactionHistory savedTransaction = transactionService.saveTransaction(transactionHistory);
        return ResponseEntity.status(HttpStatus.OK).body(savedTransaction);
    }
    @GetMapping("/getall")
    public ResponseEntity <List<TransactionHistory>> getall(){
    	List<TransactionHistory>list=transactionService.getAll();
    	return new ResponseEntity<>(list,HttpStatus.OK);
    	
    }
    
    


    
    
//Get a Transaction by ID
@GetMapping("/{transactionId}")
public ResponseEntity<TransactionHistory> getTransactionById(@PathVariable int transactionId) {
    TransactionHistory transaction = transactionService.getTransactionById(transactionId);
    if (transaction != null) {
        return ResponseEntity.ok(transaction);
    } else {
    	 return ResponseEntity.status(HttpStatus.OK).body(null);
         
    }
}

}
    


