package com.SpringProjectionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProjectionModel.ProductOneFetch;
import com.SpringProjectionRepository.ProductRepository;

import lombok.Setter;


public interface ProductService 
{

	
	List<ProductOneFetch> findByBrand(String brand);
	
}
