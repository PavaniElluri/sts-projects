package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.bean.SwiftBank;
import com.example.sample.service.SwiftService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/swift")
public class SwiftController {
	@Autowired
	private SwiftService bankservice;
	@PostMapping("/check")
	public ResponseEntity<String>checkswift(@Valid @RequestBody SwiftBank swiftbank){
		String result=bankservice.checkValidOrnot(swiftbank);
		return ResponseEntity.ok(result);
	}
	
	
	
	

}
