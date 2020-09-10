package com.wf.training.mavenweb.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		Student student = new Student();  // empty bag
		// student.setName("Dummy");
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	// @ModelAttribute will put the param data into model object
	// @Valid : Checks the constraint
	// Share with us the result
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProfile(@Valid @ModelAttribute Student student, 
							  BindingResult result) {
		// pass the student object to view page to display
		// check the result of constraint check
		if(result.hasErrors()) {
			return "student-profile";
		}
		
		return "student-confirm";
	}
}

















