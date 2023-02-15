package com.SpringProjectionMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SpringProjectionModel.Product;
import com.SpringProjectionService.ProductServiceImp;

@SpringBootApplication
//@ComponentScan(basePackages = "com.SpringProjectionService,com.SpringProjectionRepository")
public class SpringDemoProjectionApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoProjectionApplication.class, args);
	}
	@Autowired
	ProductServiceImp ps;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Product p1=new Product();
		System.out.println(ps.findByBrand("Apple"));
	}
	
}
