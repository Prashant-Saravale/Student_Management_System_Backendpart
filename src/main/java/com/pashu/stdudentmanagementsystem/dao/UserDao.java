package com.pashu.stdudentmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pashu.stdudentmanagementsystem.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
