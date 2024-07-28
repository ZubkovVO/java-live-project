package com.seleniumexpress.mvcpractice.DAO;

import java.util.List;

import com.seleniumexpress.mvcpractice.api.Student;

public interface StudentDAO {

	List<Student> loadStudents();

}
