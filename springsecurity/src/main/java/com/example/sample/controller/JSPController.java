package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sample.user.User;
import com.example.sample.userservice.UserService;

@Controller
public class JSPController {
	@Autowired
	UserService userService;

	@RequestMapping("/sam")
	public String getjsppage() {
		return "sample";
	}

	@RequestMapping("/login")
	public String getLoginpage() {
		return "login";
	}

	@RequestMapping("/wel")
	public String getwelcomepage() {
		return "welcome";
	}
	
	

	@RequestMapping("/register")
	public String getRegisterpage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String getregisterdata(@ModelAttribute("user") User user,Model model) {
		BcryptPassword4jPasswordEncoder b=new BcryptPassword4jPasswordEncoder();
		String encodePassword =b.encode(user.getPassword());
		user.setPassword(encodePassword);
		userService.save(user);
		return "welcome";
	}

}
