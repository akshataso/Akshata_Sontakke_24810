package com.cybage.dao;

import static com.cybage.utils.JDBCUtility.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;


public class ProductDao {
	
	private Connection connection;


	public ProductDao() throws SQLException,ClassNotFoundException {
		super();
		this.connection = getConnection();
	}

	public void addProduct(Product product) throws SQLException {
		
		try(
				PreparedStatement statement = connection.prepareStatement("insert into products values(default,?,?,?)");)
		{
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.setInt(3, product.getQuantity());
			
			statement.executeUpdate();
			System.out.println("Successfully Added!!");
		}
	}
	
	public void updateProduct(Product product , int productId) throws SQLException {
		
		try(PreparedStatement statement = connection.prepareStatement("update products set product_name = ?, product_price =? , product_quantity = ? where product_id = ? ");)
		{
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.setInt(3, product.getQuantity());
			statement.setInt(4, productId);
			
			statement.executeUpdate();
			System.out.println("Successfully Updated!!");
			
		}
	}
		
	public void deleteProduct(int productId) throws SQLException{
		try(PreparedStatement statement = connection.prepareStatement("delete from products where product_id = ? ");)
		{
			statement.setInt(1, productId);
			
			statement.executeUpdate();
			System.out.println("Successfully Deleted!!");
			
			
		}
	}
	
	public List<Product> displayProducts() throws SQLException{
		try(PreparedStatement statement = connection.prepareStatement("select * from products");)
		{		
			List<Product> products = new ArrayList<Product>();
			ResultSet result = statement.executeQuery();
			
			while(result.next())
			{
				products.add(new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4)));
			}
			
			return products;
		}
	}
	
	public Product getProduct(int productId) throws SQLException{
		try(PreparedStatement statement = connection.prepareStatement("select * from products where product_id=?");)
		{		
			Product product = null;
			statement.setInt(1, productId);
			ResultSet result = statement.executeQuery();
			
			while(result.next())
			{
				product = new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4));
			}
			
			return product;
		}
	}
	
	public List<Product> searchProduct(String name)
	{
		try {
			try(PreparedStatement statement = connection.prepareStatement("select * from products where product_name = ?");)
			{		
				statement.setString(1, name);
				List<Product> products = new ArrayList<Product>();
				ResultSet result = statement.executeQuery();
				
				while(result.next())
				{
					products.add(new Product(result.getInt(1), result.getString(2), result.getDouble(3), result.getInt(4)));
				}
				
				return products;
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}

}


