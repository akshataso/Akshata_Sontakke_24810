package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;
import com.cybage.utility.JdbcUtility;



public class ProductDao {
	private Connection connection;

	public ProductDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		this.connection = JdbcUtility.getConnection();
	}

	public String addProduct(Product product) {
		try {

			try (PreparedStatement preparedStatement = connection
					.prepareStatement("insert into product(name,cost,quantity) values(?,?,?)");) {
				preparedStatement.setString(1, product.getProductName());
				preparedStatement.setDouble(2, product.getProductCost());
				preparedStatement.setInt(3, product.getProductQuantity());
				int check = preparedStatement.executeUpdate();
				if (check > 0) {
					return "Product added successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "Product insertion failed";
	}

	public String updateProduct(int pid, Product product) {
		try {

			try (PreparedStatement preparedStatement = connection
					.prepareStatement("update product set name=?, cost=?, quantity=? where id=?");) {
				preparedStatement.setString(1, product.getProductName());
				preparedStatement.setDouble(2, product.getProductCost());
				preparedStatement.setInt(3, product.getProductQuantity());
				preparedStatement.setInt(4, pid);
				int check = preparedStatement.executeUpdate();
				if (check > 0) {
					return "Product updated successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "Product updation failed";
	}

	public String deleteProduct(int pid) {
		try {

			try (PreparedStatement preparedStatement = connection.prepareStatement("delete from product where id=?");) {

				preparedStatement.setInt(1, pid);
				int check = preparedStatement.executeUpdate();
				if (check > 0) {
					return "Product deleted successfully";
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return "Product deletion failed";
	}

	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<>();
		try {
			try (PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
					ResultSet resultSet = preparedStatement.executeQuery();) {

				while (resultSet.next()) {
					productList.add(new Product(resultSet.getString(2), resultSet.getInt(4), resultSet.getDouble(3)));
				}
				return productList;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return productList;

	}

	public Product getProduct(int pid) {
		Product product = null;
		
		try {
			try (PreparedStatement preparedStatement = connection.prepareStatement("select * from product where id=?");
					) {
				preparedStatement.setInt(1, pid);
				ResultSet resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					product = new Product(resultSet.getString(2), resultSet.getInt(4), resultSet.getDouble(3));
				}
				resultSet.close();
				return product;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return product;

	}

}
