package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ProductService;
@WebServlet("/list-products.do")
public class ListProductServlet extends HttpServlet{
	private ProductService ps = new ProductService();
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		req.setAttribute("product", ps.getProducts());
		req.getRequestDispatcher("list-products.jsp").forward(req, res);
	}

}
