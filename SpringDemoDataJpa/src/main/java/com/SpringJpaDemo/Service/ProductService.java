package com.SpringJpaDemo.Service;

import java.util.List;

import com.SpringJpaDemo.Exception.ProductNotFoundException;
import com.SpringJpaDemo.Model.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	
	void updateProduct(Product prodcut);
	
	void deleteProduct(int pid);
	
	Product getById(int  pid) throws ProductNotFoundException;
	
	List<Product> FindAll() throws ProductNotFoundException;

//	Product addProduct();
	public void  addProduct();
	//Product addProduct(List<Product> product);
	
	public void addProduct(List<Product> product);
}
