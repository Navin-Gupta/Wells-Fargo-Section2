package com.wf.training.cruddemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.training.cruddemo.entity.Student;
import com.wf.training.cruddemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public void getAllStudents() {
		
	}
	
	@GetMapping("/students/{id}")
	public void getStudentById(@PathVariable("id") Long id) {
		
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		
	}
	
	@PutMapping("/students")
	public void editStudent(@RequestBody Student student) {
		
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		
	}
}
