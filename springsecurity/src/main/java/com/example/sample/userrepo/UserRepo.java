package com.example.sample.userrepo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.user.User;

//UserRepo.java

@Repository
public interface UserRepo extends JpaRepository<User,String>{
	User findByUsername(String username);
	
 
}

