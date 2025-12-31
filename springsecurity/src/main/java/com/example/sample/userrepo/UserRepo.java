package com.example.sample.userrepo;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.sample.user.User;

//UserRepo.java


public interface UserRepo extends JpaRepository<User,String>{
	User findByUsername(String username);
	
 
}

