package com.SpringProjectionRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringProjectionModel.Product;
import com.SpringProjectionModel.ProductOneFetch;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>
{

	List<ProductOneFetch> findByBrand(String brand);
}
