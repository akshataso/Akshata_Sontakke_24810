package com.cybage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.User;
import com.cybage.service.ProductService;
import com.cybage.service.UserService;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService ;
    private ProductService productService;
    
    public Authenticate() {
        super();
        userService = new UserService();
        productService = new ProductService();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		User user = userService.authenticateUser(name, password);
		request.setAttribute("ProductList", productService.displayProducts());
		
		
		if(user.getUserType().equals("A"))
			request.getRequestDispatcher("adminHome.jsp").forward(request, response);
		else
			request.getRequestDispatcher("userHome.jsp").forward(request, response);
			
		
	}

}
