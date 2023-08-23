package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

private static String Host = "localhost"; 
private static String Password = "projetcs";
private static int Port = 3306;
private static String Schema = "projects";
private static String User = "projects"; 

public static Connection getConnection() {
	String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
					Host, Port, Schema, User, Password);
	
	System.out.println("Connecting with url=" + url);
	
	try {
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Connection successfully!!");
		return conn;
		
	} catch (SQLException e) {
		System.out.println("Error with connection");
		throw new DbException(e); 

	
	}
	
	
	
	
}
}
