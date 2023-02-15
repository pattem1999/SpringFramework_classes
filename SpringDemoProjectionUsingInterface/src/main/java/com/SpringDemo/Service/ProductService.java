package com.SpringDemo.Service;

import java.util.List;

import com.SpringDemo.Model.ProductRetrieve;

public interface ProductService 
{
	List<ProductRetrieve> findByBrand(String brand);
}
