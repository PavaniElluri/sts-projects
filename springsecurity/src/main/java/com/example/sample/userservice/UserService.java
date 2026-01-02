package com.example.sample.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sample.user.User;
import com.example.sample.userrepo.UserRepo;

//UserService.java

@Service
public class UserService implements UserDetailsService{

@Autowired
private UserRepo userRepo;

public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
	User user=userRepo.findByUsername(username);
	return user;
	
}
public void save(User user) {
	userRepo.save(user);
	
}

	
}









