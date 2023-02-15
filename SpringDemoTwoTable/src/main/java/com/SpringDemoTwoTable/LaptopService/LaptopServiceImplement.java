package com.SpringDemoTwoTable.LaptopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDemoTwoTable.Model.Laptop;
import com.SpringDemoTwoTable.Model.Student;
import com.SpringDemoTwoTable.Repository.LaptopRepository;

import lombok.Setter;
@Service
public class LaptopServiceImplement implements LaptopService {

	@Autowired
	@Setter
	private LaptopRepository laptopRepository;
	@Override
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
		laptopRepository.save(laptop);
		System.out.println("inserted successfully");
	}
	
	
	
	
	

}
