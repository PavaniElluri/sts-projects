package com.example.sample.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.bean.TransactionHistory;
@Repository
public interface TransactionHistoryrepo extends JpaRepository<TransactionHistory,Integer>{
	
}
	


