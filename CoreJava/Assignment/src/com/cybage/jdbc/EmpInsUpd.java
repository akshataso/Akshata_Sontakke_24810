
package com.cybage.jdbc;

import static com.cybage.jdbc.JdbcUtility.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpInsUpd {

	public static void main(String[] args) {
		try {
			Connection connection = getConnection();

			try (PreparedStatement preparedStatement = connection.prepareStatement(
					"insert into employee(name,designation,salary,department,address) values (?,?,?,?,?)");
					PreparedStatement preparedStatement2 = connection
							.prepareStatement("update employee set salary=? where name=?");

					PreparedStatement preparedStatement3 = connection
							.prepareStatement("insert into student(name,subject) values (?,?)");) {

				preparedStatement.setString(1, "Alpha");
				preparedStatement.setString(2, "Developer");
				preparedStatement.setDouble(3, 25000);
				preparedStatement.setString(4, "DevGrp");
				preparedStatement.setString(5, "Mumbai");
				preparedStatement.addBatch();
				preparedStatement.setString(1, "Bravo");
				preparedStatement.setString(2, "QA");
				preparedStatement.setDouble(3, 35000);
				preparedStatement.setString(4, "Quality");
				preparedStatement.setString(5, "Pune");
				preparedStatement.addBatch();
				preparedStatement.setString(1, "Delta");
				preparedStatement.setString(2, "Tester");
				preparedStatement.setDouble(3, 22000);
				preparedStatement.setString(4, "Testing");
				preparedStatement.setString(5, "Banglore");
				preparedStatement.addBatch();

				int[] count = preparedStatement.executeBatch();
				if (count.length > 0) {
					System.out.println("Employee Records inserted");
				}

				preparedStatement2.setDouble(1, 30000);
				preparedStatement2.setString(2, "Alpha");
				int check = preparedStatement2.executeUpdate();
				if (check > 0) {
					System.out.println("Employee Record updated");
				}

				preparedStatement3.setString(1, "Charlie");
				preparedStatement3.setString(2, "Java");
				int stat = preparedStatement3.executeUpdate();
				if (stat > 0) {
					System.out.println("Student record inserted");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
