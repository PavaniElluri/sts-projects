package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {

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

}
