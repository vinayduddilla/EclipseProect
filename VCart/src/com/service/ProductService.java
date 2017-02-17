package com.service;

import java.util.ArrayList;
import java.util.List;

import com.domain.Product;

public class ProductService {
	private static List<Product> product = new ArrayList<>();
	static{
		
		product.add(new Product("Washing Machine","Appliance"));
		product.add(new Product("Bed","Furniture"));
		product.add(new Product("Refrigirator","Appliance"));
		product.add(new Product("Chair","Furniture"));
		product.add(new Product("Dish Washer","Appliance"));

	}
	public List<Product> getProducts(){
		return product;
	}
	
	public void addProduct(Product product2){
		product.add(product2);
	}
	
	public void delProduct(Product product3){
		product.remove(product3);
	}
	public void updateProduct(Product p1, Product p2){
		product.set(product.indexOf(p1), p2);
	}
}
