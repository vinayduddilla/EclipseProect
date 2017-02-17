package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.service.ProductService;

@WebServlet("/update-product.do")
public class UpdateProductServlet extends HttpServlet {
	
private ProductService ps = new ProductService();
private Product p;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		//ps.delProduct(new Product(req.getParameter("product"),req.getParameter("productCategory")));
		p = new Product(req.getParameter("product"),req.getParameter("productCategory"));
		req.getRequestDispatcher("/update.jsp").forward(req, res);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String newProduct = req.getParameter("product");
		String category = req.getParameter("category");
		ps.updateProduct(p,new Product(newProduct,category));
		res.sendRedirect("/VCart/list-products.do");
	}

}
