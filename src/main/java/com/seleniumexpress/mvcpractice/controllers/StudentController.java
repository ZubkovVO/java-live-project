package com.seleniumexpress.mvcpractice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.seleniumexpress.mvcpractice.DAO.StudentDAO;
import com.seleniumexpress.mvcpractice.api.Student;
import com.seleniumexpress.mvcpractice.api.StudentDTO;

@Controller
public class StudentController {

	@Autowired
	private StudentDAO StudentDAO;

	@GetMapping("/home")
	public String showStudentHomePage(Model model) {

		// call the DAO method to get the data

		List<Student> studentList = StudentDAO.loadStudents();

		model.addAttribute("students", studentList);

		return "home-page";
	}
	
	@GetMapping("/addStudent")
	public String showAddStudentPage(Model model) {
		
		StudentDTO studentDTO = new StudentDTO();
		
		model.addAttribute("student", studentDTO);
		
		return "add-student";
		
	}

}
