package com.sapient.aem.web;



import java.sql.Connection;
import java.sql.SQLException;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sapient.aem.model.Student;



public class Connections{

public static Connection jdbcConnection() throws NamingException, SQLException {
Context envContext = (Context) new InitialContext().lookup("java:comp/env");
DataSource dataSource = (DataSource) envContext.lookup("jdbc/smsDB");
Connection connection= dataSource.getConnection();
return connection;

}



}