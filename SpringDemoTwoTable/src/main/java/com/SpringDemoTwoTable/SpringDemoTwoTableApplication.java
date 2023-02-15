package com.SpringDemoTwoTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SpringDemoTwoTable.LaptopService.LaptopService;
import com.SpringDemoTwoTable.Model.Laptop;
import com.SpringDemoTwoTable.Model.Student;

@SpringBootApplication
//@ComponentScan(basePackages =  "com.SpringDemoTwoTable.LaptopService,com.SpringDemoTwoTable.Model")
public class SpringDemoTwoTableApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoTwoTableApplication.class, args);
	}
	@Autowired
	LaptopService ls;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Student s1=new Student(); s1.setPhoneno(95904437); s1.setSname("ramana");
		 * 
		 * Laptop l1=new Laptop(); l1.setLname("lenovo"); l1.setPrice(100000.0);
		 * //l1.setSt(s1); s1.setLaptop(l1); ls.addLaptop(l1);
		 */
		
		Student s1=new Student();
		s1.setSname("Abhi");
		s1.setPhoneno(236045473);
		Laptop l1=new Laptop();
		l1.setLname("lenovo");
		l1.setPrice(74000.44);
		l1.setSt(s1);
		s1.setLaptop(l1);
		ls.addLaptop(l1);
		
	}

}
