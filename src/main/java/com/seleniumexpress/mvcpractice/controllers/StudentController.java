package com.seleniumexpress.mvcpractice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.mvcpractice.DAO.StudentDAO;
import com.seleniumexpress.mvcpractice.api.Student;

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

		Student student = new Student();

		model.addAttribute("student", student);

		return "add-student";

	}

	@ResponseBody
	@GetMapping("/save-student")
	public String showStudentSavePage(Student student) {

		System.out.println(student);
		
		//do a DAO call to save students
		StudentDAO.saveStudent(student);

		return "student saved...";

	}

}
