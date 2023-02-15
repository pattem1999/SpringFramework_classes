package com.cds.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Student getStudent()
	{
		Student s=new Student();
		s.setSid(100);
		s.setName("ramana");
		s.setAddress(s.getAddress());
		return s;
	}
	@Bean
	public Address getAddress()
	{
		Address ad=new Address();
		ad.setPin(5163432);
		ad.setCity("vizag");
		
		return ad;
	}
}
