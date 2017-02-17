package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.domain.Product;
import com.service.ProductService;

@WebServlet("/add-product.do")

public class AddProductServlet extends HttpServlet {
	private ProductService ps = new ProductService();
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		req.getRequestDispatcher("/add.jsp").forward(req, res);
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String newProduct = req.getParameter("product");
		String category = req.getParameter("category");
		ps.addProduct(new Product(newProduct,category));
		res.sendRedirect("/VCart/list-products.do");
	}
	

}
