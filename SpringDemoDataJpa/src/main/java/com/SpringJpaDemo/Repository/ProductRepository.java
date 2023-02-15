package com.SpringJpaDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringJpaDemo.Model.Product;
@Repository
public interface ProductRepository  extends  JpaRepository<Product, Integer>
{

	//Product saveAll(Product p1, Product p2);

}
