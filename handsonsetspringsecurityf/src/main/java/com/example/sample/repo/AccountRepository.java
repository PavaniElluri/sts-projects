package com.example.sample.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.bean.Account;
@Repository
public interface AccountRepository extends JpaRepository <Account,Integer>{
	List<Account> findByBranchId(String branchId);

	
}
	


