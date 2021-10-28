package com.cybage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.ProductService;


@WebServlet("/searchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductService productService;   
   
    public SearchProduct() {
        super();
        productService = new ProductService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String product = request.getParameter("product");
		
		request.setAttribute("ProductList", productService.searchProduct(product));
		request.getRequestDispatcher("userHome.jsp").forward(request, response);
		
	}

}
