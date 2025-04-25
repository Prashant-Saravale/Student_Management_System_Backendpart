package com.pashu.stdudentmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pashu.stdudentmanagementsystem.dao.StudentDao;
import com.pashu.stdudentmanagementsystem.entity.Student;

@Service
public class StudentService {
	
	@Autowired 
	private StudentDao dao;

	public List<Student> getAllStudent() {
		
		 return dao.findAll();
	
		// TODO Auto-generated method stub
		
	}

	public String  saveStudent(Student student) {
		// TODO Auto-generated method stub
	     Student s=dao.save(student);
	     if (s==null) {
			return "not save";
		}else
		{
			return "save";
			
		}
	}

	public String deleteStudent(int roll) {
		// TODO Auto-generated method stub
		dao.deleteById(roll);
		return "delete Student "+roll+"";
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
	return dao.save(student);
	
	}

	
	
	public Student getStudentById(int roll) {
	    return dao.findById(roll).orElse(null);
	}

	public Student getStudentByName(String name) {
	    return dao.findByName(name);
	}

	

}
