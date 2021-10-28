package com.cybage.jdbc;

import static com.cybage.jdbc.JdbcUtility.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class Assignment3 {

	public static void main(String[] args) {
				
		
		try(Connection connection = getConnection();
			Scanner scanner = new Scanner(System.in)) 
		{
		
			System.out.println("Enter a table name for details!");
			String query = "select * from " + scanner.next();
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			int count = result.getMetaData().getColumnCount();
			
			for(int i=1; i<=count; i++ )
			{
				System.out.print(result.getMetaData().getColumnName(i)+" |\t");
			}
			System.out.println();
			
			while(result.next())
			{
				for(int i=1; i<=count; i++ )
				{
					System.out.print(result.getObject(i)+"  |\t\t");
				}
				System.out.println();
			}		
		}catch(ClassNotFoundException e ) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}


