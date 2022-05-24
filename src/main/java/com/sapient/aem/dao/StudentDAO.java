package com.sapient.aem.dao;






import java.sql.SQLException;

import com.sapient.aem.model.Student;

//CRUD operations
public interface StudentDAO {

	public abstract Integer addStudent(Student student) throws SQLException;
	public abstract Student getStudentByAadharCard(Long aadhar_card )throws SQLException;
	
}
