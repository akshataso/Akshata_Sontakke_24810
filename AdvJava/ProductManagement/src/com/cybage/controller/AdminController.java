package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.ProductService;


@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private ProductService productService;
    
    public AdminController() {
        super();
        productService = new ProductService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		int id = Integer.parseInt(request.getParameter("id"));
		
		if(action.equals("DELETE"))
		{
			productService.deleteProduct(id);
			request.setAttribute("ProductList", productService.displayProducts());
			request.getRequestDispatcher("adminHome.jsp").forward(request, response);
		}
	}

}
