package com.pashu.stdudentmanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pashu.stdudentmanagementsystem.entity.Student;

@Repository
public interface StudentDao  extends JpaRepository<Student, Integer>{

	Student findByName(String name);

	

	

}
