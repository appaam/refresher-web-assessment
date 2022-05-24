package com.sapient.aem.dao;

import com.sapient.aem.mapper.QueryMapper;
import com.sapient.aem.model.Student;
import com.sapient.aem.util.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class StudentDAOImpl implements StudentDAO{





	public Integer addStudent(Student student) throws SQLException {
		
		
		Connection connection=null;
		try{

			connection= Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(QueryMapper.INSERT_STUDENT);

			
			preparedStatement.setLong(1, student.getAdmissionCode());
			preparedStatement.setString(2, student.getClassName());	
			
			preparedStatement.setString(3, student.getName());
			preparedStatement.setInt(4, student.getSubject1());
			preparedStatement.setInt(5, student.getSubject2());
			preparedStatement.setInt(6, student.getSubject3());
			preparedStatement.setInt(7, student.getSubject4());
			preparedStatement.setInt(8, student.getSubject5());
			preparedStatement.setInt(9, student.getSubject6());
			preparedStatement.setString(10, student.getGrade());
			preparedStatement.setLong(11, student.getAdharCard());
			
//			String grade= getStudentGrade(student);
			
			
			
//			preparedStatement.setArray(5, student.getMarksList().get(0));
//			preparedStatement.setObject(5, student.getMarksList().get(0));
//			preparedStatement.setObject(6, student.getMarksList().get(1));
//			preparedStatement.setObject(7, student.getMarksList().get(2));
//			preparedStatement.setObject(8, student.getMarksList().get(3));
//			preparedStatement.setObject(9, student.getMarksList().get(4));
//			preparedStatement.setObject(10, student.getMarksList().get(5));
			
			

			int n= preparedStatement.executeUpdate();
			if(n>0) {
			return getId();
			}else {
				return null;
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
		}

		
	

	private Integer getId() throws SQLException {
		
		Connection connection=null;
		try {
			connection=Connections.jdbcConnection();
			Statement statement= connection.createStatement();
			ResultSet resultSet=statement.executeQuery(QueryMapper.GET_ID);

			if(resultSet.next()) {
				return resultSet.getInt(1);
			}else {
				throw new SQLException("No records in the table");
			}
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}




	@Override

		public Student getStudentByAadharCard(Long aadhar_card) throws SQLException {
			Connection connection=null;
			try {





			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(QueryMapper.GET_STUDENT_BY_ID);





			preparedStatement.setLong(1, aadhar_card);
			ResultSet resultSet= preparedStatement.executeQuery();





			if(resultSet.next()) {
			Student student=new Student();





			populateStudent(resultSet,student);
			return student;
			}else {
			return null;
			}





			}catch(SQLException e) {





			throw e;
			}catch(Exception e) {
			throw new SQLException(e.getMessage());
			}finally {
			connection.close();
			}





			}







			private void populateStudent(ResultSet resultSet, Student student) throws SQLException {
			student.setAdharCard(resultSet.getLong("adharCard"));
			student.setName(resultSet.getString("name"));
			student.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
			student.setAddress(resultSet.getString("address"));
			student.setEmail(resultSet.getString("email"));
			student.setMobile(resultSet.getLong("mobile"));
			student.setAdmissionCode(resultSet.getLong("admissioncode"));
			student.setClassName(resultSet.getString("classname"));
			student.setSubject1(resultSet.getInt("subject1"));
			student.setSubject2(resultSet.getInt("subject2"));
			student.setSubject3(resultSet.getInt("subject3"));
			student.setSubject4(resultSet.getInt("subject4"));
			student.setSubject5(resultSet.getInt("subject5"));
			student.setSubject6(resultSet.getInt("subject6"));
			student.setGrade(resultSet.getString("grade"));




			}

	


}




