package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;


public class ProductService {
ProductDao pDao;
	public ProductService() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		pDao = new ProductDao();
	}
	
	public String addProduct(Product product) {
		return pDao.addProduct(product);
	}
	
	public String updateProduct(int pid, Product product) {
		return pDao.updateProduct(pid, product);
	}
	
	public String deleteProduct(int pid) {
		return pDao.deleteProduct(pid);
	}
	
	public List<Product> getAllProducts(){
		return pDao.getAllProducts();
	}
	
	public Product getProduct(int pid) {
		return pDao.getProduct(pid);
	}
}
