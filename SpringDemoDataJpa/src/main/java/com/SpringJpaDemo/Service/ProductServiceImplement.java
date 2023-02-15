package com.SpringJpaDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringJpaDemo.Model.Product;
import com.SpringJpaDemo.Repository.ProductRepository;

import lombok.Setter;
@Service
public class ProductServiceImplement implements ProductService {
	
	@Autowired
	@Setter
	private ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		//Product p=productRepository.save(product);
		Product p=productRepository.save(product);
			//productRepository.saveAll(List)
		return p;
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	@Override
	public Product getById(int pid)   {
		// TODO Auto-generated method stub
		/*
		 * Object op= productRepository.findById(pid); List<Product> lp=(List<Product>)
		 * op; if(lp.isEmpty())
		 */
		
		return null;
	}

	@Override
	public List<Product> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		productRepository.deleteById(pid);
	}

	

	@Override
	public void  addProduct(){
		
		Product p1=new Product("Complain","Complain", "Milk drink ",450.00); 
		Product p2=new Product("spark","spark", "shoes ",450.00); 
		productRepository.saveAll(List.of(p1,p2));
		 
		
	}

	@Override
	public void addProduct(List<Product> product) {
		// TODO Auto-generated method stub
		List<Product> p1=productRepository.saveAll(product);
		System.out.println(p1);
	}

	
}
