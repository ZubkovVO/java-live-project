package com.seleniumexpress.mvcpractice.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.mvcpractice.api.Student;
import com.seleniumexpress.mvcpractice.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		String sql = "SELECT * FROM students";

		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());

		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {
		// write the logic to store the student object into the database

		Object[] sqlParams = { student.getName(), student.getMobile(), student.getCountry() };

		String sql = "INSERT INTO students(name, mobile, country) values (?,?,?) ";

		jdbcTemplate.update(sql, sqlParams);

		System.out.println("1 record updated...");

	}

}
