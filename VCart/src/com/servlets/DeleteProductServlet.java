package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.service.ProductService;
@WebServlet("/delete-product.do")

public class DeleteProductServlet extends HttpServlet {
	
	private ProductService ps = new ProductService();
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		ps.delProduct(new Product(req.getParameter("product"),req.getParameter("productCategory")));
		res.sendRedirect("/VCart/list-products.do");
	}
}
