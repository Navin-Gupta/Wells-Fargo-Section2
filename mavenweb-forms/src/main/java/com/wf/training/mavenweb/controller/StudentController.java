package com.wf.training.mavenweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.training.mavenweb.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/home")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		Student student = new Student();
		student.setName("Dummy");
		model.addAttribute("student", student);
		return "student-profile";
	}
}
