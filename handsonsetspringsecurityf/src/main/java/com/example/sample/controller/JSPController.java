package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.time.LocalDate;

import com.example.sample.bean.Account;
import com.example.sample.bean.TransactionHistory;

import com.example.sample.service.AppService.AppService;

@Controller
public class JSPController {

    @Autowired
    private AppService service;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/wel")
    public String welcome() {
        return "welcome";
    }

    
    
 // -------- ACCOUNT --------
    @GetMapping("/account")
    public String accountPage(Model model) {
        model.addAttribute("account", new Account());
        return "account";
    }

    @PostMapping("/account")
    public String saveAccount(@ModelAttribute Account account) {
        service.saveAccount(account);
        return "account";
    }

    // -------- TRANSACTION --------
    @GetMapping("/transaction")
    public String transactionPage(Model model) {
        model.addAttribute("transaction", new TransactionHistory());
        return "transaction";
    }

    @PostMapping("/transaction")
    public String saveTransaction(@ModelAttribute TransactionHistory tx) {
        tx.setDate(java.time.LocalDate.now());
        service.saveTransaction(tx);
        return "transaction";
    }
}