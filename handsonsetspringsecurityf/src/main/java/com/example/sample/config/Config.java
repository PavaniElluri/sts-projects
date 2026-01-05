package com.example.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.sample.service.AppService.AppService;

@Configuration
@EnableWebSecurity
public class Config {

    @Autowired
	private AppService service;

	// 🔐 Password encoder
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 🔐 Authentication provider
	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider dp = new DaoAuthenticationProvider(service);
		// dp.setUserDetailsService(service);
		dp.setPasswordEncoder(passwordEncoder());
		return dp;
	}

	// 🔐 Security rules
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
		.csrf(csrf ->csrf.disable())
		.authorizeHttpRequests(auth ->auth
		.anyRequest().permitAll()
		);
		return http.build();

	}
	}
