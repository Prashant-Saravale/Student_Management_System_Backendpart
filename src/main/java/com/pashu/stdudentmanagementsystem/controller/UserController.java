package com.pashu.stdudentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pashu.stdudentmanagementsystem.entity.RegisterRequest;
import com.pashu.stdudentmanagementsystem.entity.User;
import com.pashu.stdudentmanagementsystem.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/register")
	public ResponseEntity<String> register( @RequestBody RegisterRequest request) {
		User user = new User ();
		user.setUsername(request.getUsername());
		user.setPassword(request.getPassword());
	  System.out.println("Received: " + request.getUsername() );
		
		String result = service.register(user);
		return ResponseEntity.ok(result);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {
		String result = service.login(user);
		return ResponseEntity.ok(result);
	}
}
