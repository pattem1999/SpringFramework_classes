package com.SpringDemo.Repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SpringDemo.Model.Product;
import com.SpringDemo.Model.ProductRetrieve;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	
	List<ProductRetrieve> findByBrand(String brand);
}