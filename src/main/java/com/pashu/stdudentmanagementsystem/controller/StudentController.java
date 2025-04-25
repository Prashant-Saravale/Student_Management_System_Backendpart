package com.pashu.stdudentmanagementsystem.controller;

import java.lang.invoke.StringConcatFactory;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pashu.stdudentmanagementsystem.dao.StudentDao;
import com.pashu.stdudentmanagementsystem.entity.Student;
import com.pashu.stdudentmanagementsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentService service;
	private StudentDao dao;

	@GetMapping("/getallStudent")

	public List<Student> getAllStudent() {
		return service.getAllStudent();

	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student)
	{
		 return service.saveStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{roll}")
	public String deleteStudent(@PathVariable  int roll)
	{ 
		 return service.deleteStudent(roll);
		
	}
	
	@PutMapping("/updateStudent/{roll}")
	public Student updateStudent(@PathVariable int roll,@RequestBody Student student )
	{
		student.setRoll(roll);
		return service.updateStudent(student);
	}
	
	@GetMapping("/getStudent/{roll}")
	public ResponseEntity<Student> getStudent(@PathVariable int roll) {
	    Student student = service.getStudentById(roll);
	    if (student != null) {
	        return new ResponseEntity<>(student, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	
	
	@GetMapping("/getStudentByName/{name}")
	public ResponseEntity<Student> getStudentByName(@PathVariable String name) {
	    Student student = service.getStudentByName(name);
	    if (student != null) {
	        return new ResponseEntity<>(student, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

}