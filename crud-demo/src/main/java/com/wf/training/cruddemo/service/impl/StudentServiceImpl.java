package com.wf.training.cruddemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.training.cruddemo.entity.Student;
import com.wf.training.cruddemo.repository.StudentRepository;
import com.wf.training.cruddemo.service.StudentService;

// @Component
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student add(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
