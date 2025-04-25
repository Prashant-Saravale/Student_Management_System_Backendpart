package com.pashu.stdudentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pashu.stdudentmanagementsystem.dao.UserDao;
import com.pashu.stdudentmanagementsystem.entity.RegisterRequest;
import com.pashu.stdudentmanagementsystem.entity.User;

@Service
public class UserService {

	 @Autowired
	    private UserDao dao;

	    // Register user
	    public String register(User user) {
	        // check if username already exists
	        User existingUser = dao.findByUsername(user.getUsername());
	        if (existingUser != null) {
	            return "Username already taken!";
	        }
	        dao.save(user);
	        return "User registered successfully";
	    }

	    // Login user
	    public String login(User user) {
	        User existingUser = dao.findByUsername(user.getUsername());
	        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
	            return "Login successful, Welcome " + existingUser.getUsername();
	        }
	        return "Invalid username or password!";
	    }
	}