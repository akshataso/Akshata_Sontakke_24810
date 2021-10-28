package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JdbcUtility {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		// Loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establishing connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productMgmt", "root", "root");

		return connection;

	}
}
