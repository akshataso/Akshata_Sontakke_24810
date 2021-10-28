package com.cybage.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.cybage.utils.JDBCUtility.getConnection;
import com.cybage.model.User;


public class UserDao {


	public UserDao()
	{
		super();
	}
	
	public User authenticateUser(String name, String password)
	{
		try {
			try(
					Connection connection = getConnection();
					PreparedStatement statement = connection.prepareStatement("select * from users where user_name = ? and password = ?");)
			{
				statement.setString(1, name);
				statement.setString(2, password);
				ResultSet result = statement.executeQuery();
				if(result.next())
				{
					User user = new User(result.getInt(1), result.getString(2), result.getString(3), result.getString(4));
					return user;
				}
				
			}
		}catch (SQLException | ClassNotFoundException e) {
			System.out.println("Exception in authenticateUser" + e.getMessage());
		}
		return null;
		
	}
}


