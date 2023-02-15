package com.SpringDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SpringDemo.Model.ProductRetrieve;
import com.SpringDemo.Repository.ProductRepository;

import lombok.Setter;
@Service
public class ProductServiceImp implements ProductService
{

	@Autowired
	@Setter
	ProductRepository pr;
	@Override
	public List<ProductRetrieve> findByBrand(String brand) {
		// TODO Auto-generated method stub
		
		
		return pr.findByBrand(brand);
	}

}
