package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;


public class ProductService {

	private ProductDao productDao;
	
	public ProductService(){
		super();
		try {
			productDao = new ProductDao();
		}catch (SQLException|ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void addProduct(Product product) {
		
		try {
			productDao.addProduct(product);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void updateProduct(Product product, int productId) {
			
			try {
				productDao.updateProduct(product , productId);
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
	}
	
	public void deleteProduct(int productId) {
		
		try {
			productDao.deleteProduct(productId);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<Product> displayProducts(){
		try
		{		
			return productDao.displayProducts();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	public Product getProduct(int productId){
		try
		{		
			return productDao.getProduct(productId);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	public List<Product> searchProduct(String name)
	{
		return productDao.searchProduct(name);
		
	}
}


