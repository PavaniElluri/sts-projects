package com.example.sample.service.AppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sample.bean.Account;
import com.example.sample.bean.TransactionHistory;

import com.example.sample.repo.AccountRepository;
import com.example.sample.repo.TransactionHistoryrepo;


@Service
public class AppService implements UserDetailsService {

    

    @Autowired
    private AccountRepository accountRepo;

    @Autowired
    private TransactionHistoryrepo transactionRepo;

    // 🔐 Spring Security login
    

    // 🔹 Save account
    public void saveAccount(Account account) {
        accountRepo.save(account);
    }

    // 🔹 Save transaction
    public void saveTransaction(TransactionHistory tx) {
        transactionRepo.save(tx);
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
