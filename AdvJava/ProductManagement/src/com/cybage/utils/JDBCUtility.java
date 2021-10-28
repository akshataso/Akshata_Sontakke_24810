package com.cybage.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtility {
	
	
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		
			Connection connection = null;		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
				    .getConnection("jdbc:mysql://localhost:3306/product_management", "root", "root");
			return connection;

	}
}


