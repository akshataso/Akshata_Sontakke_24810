package com.cybage.jdbc;

import static com.cybage.jdbc.JdbcUtility.getConnection;

import java.sql.CallableStatement;
import java.sql.Connection;





public class CallableStatementProcedure {

	public static void main(String[] args) {
		
		try(Connection connection = getConnection(); 
				CallableStatement statement = connection.prepareCall("call salaryHike(?)");) 
		
		{		
		
			statement.setString(1, "a");
			statement.execute();
			
			System.out.println("Salaries hiked successfully!!");			
			
		}catch(ClassNotFoundException e ) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}


