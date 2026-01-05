package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.sample.bean.Account;
import com.example.sample.service.AccountService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Save Account
    @PostMapping("/save")
    public ResponseEntity<Account> saveAccount(@Valid @RequestBody Account account) {
        Account savedAccount = accountService.saveAccount(account);
        
        return ResponseEntity.status(HttpStatus.OK).body(savedAccount);
    }

    // Get Account by Account Number
    @GetMapping("/{accNum}")
    public ResponseEntity<Account> getAccount(@PathVariable int accNum) {
        Account account = accountService.getAccountByAccNum(accNum);
        if (account != null) {
            return ResponseEntity.ok(account);
        } else {
            
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }
    }

    // Get Accounts by Branch ID
    @GetMapping("/branch/{branchId}")
    public ResponseEntity<List<Account>> getAccountsByBranchId(@PathVariable String branchId) {
        List<Account> accounts = accountService.getAccountsByBranchId(branchId);
        if (!accounts.isEmpty()) {
            return ResponseEntity.ok(accounts);
        } else {
            
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }
    }
    @GetMapping("/getall")
    public ResponseEntity <List<Account>> getall(){
    	List<Account>list=accountService.getAll();
    	return new ResponseEntity<>(list,HttpStatus.OK);
    }
    

}

