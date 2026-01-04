package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.bean.Transaction;
@Repository
public interface Transactionrepo extends JpaRepository <Transaction,String> {

}
