package com.SpringProjectionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProjectionModel.ProductOneFetch;
import com.SpringProjectionRepository.ProductRepository;

import lombok.Setter;

@Service
public class ProductServiceImp implements ProductService {
	

	@Autowired
	@Setter
	ProductRepository productRepository;

	@Override
	public List<ProductOneFetch> findByBrand(String brand) {
		// TODO Auto-generated method stub
		
		return productRepository.findByBrand(brand);
	}
	
	

}
