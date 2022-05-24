package com.sapient.aem.mapper;



public interface QueryMapper {
	//query that returns all details of a teacher based on adhar_card.
	public static final String GET_TEACHER_BY_ID= "select * from person p inner join teacher t on p.adhar_card= t.adhar_card where p.adhar_card=?";
	public static final String GET_STUDENT_BY_ID= "select * from person p inner join student s on p.adhar_card= s.adhar_card where p.adhar_card=?";
	public static final String GET_PERSON_BY_ADHARCARD="select * from person where adhar_card= ?";
	public static final String GET_PERSON= "select * from person";
	public static final String INSERT_PERSON= "insert into person(adhar_card,name,birthdate,address,email_id,mobile_number) values(?,?,?,?,?,?)";
	public static final String GET_ADHAR="select max(adharCrad) from person";
	public static final String UPDATE_PERSON="update person set birthdate=?,address=?,email=?,mobile=? where adhar_card=?";
	public static final String DELETE_PERSON="delete from person where adhar_card=?";
	public static final String INSERT_STUDENT= "insert into student(admission_code,class_name,student_name,subject1,subject2,subject3,subject4,subject5,subject6,grade,adhar_card) values(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String GET_ID="select max(admission_code) from student";
	public static final String GET_TEACHERS= "select * from teacher";
	public static final String GET_TEACHER="select * from teacher where teacher_id= ?";
	public static final String INSERT_TEACHER= "insert into teacher(qualification,gender,salary,adhar_card,teacher_name) values(?,?,?,?,?)";
	public static final String GET_TEACHER_ID="select max(teacher_id) from teacher";
	public static final String UPDATE_TEACHER="update teacher set qualification=?,gender=?,salary=?,adhar_card=? where teacher_id=?";
	public static final String DELETE_TEACHER="delete from teacher where teacher_id=?";
}