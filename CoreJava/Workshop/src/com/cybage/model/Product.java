package com.cybage.model;



public class Product {
	
	private String productName;
	private int productQuantity;
	private double productCost;
	
	
	
	public Product(String productName, int productQuantity, double productCost) {
		
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productCost = productCost;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productQuantity=" + productQuantity + ", productCost="
				+ productCost + "]";
	}
	
	
}
