package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		
		/*
		 * Emp e=new Emp(); //e.setEmpid(100); e.setEname("ramana"); e.setSalary(25000);
		 * System.out.println(e);
		 */	
		
		//User u1=new User(100,"ramana","venkata",19,"male");
		
		
		/*u1.setId(100);
		u1.setFname("ramana");
		u1.setLname("venkata");
		u1.setAge(19);
		u1.setGender("male"*/
		
		/*
		 * System.out.println(u1); System.out.println(u1.toString());
		 */
		
		/*
		 * System.out.println(u1.getId()); System.out.println(u1.getAge());
		 * System.out.println(u1.getFname()); System.out.println(u1.getLname());
		 * System.out.println(u1.getGender());
		 */
		Person p1=Person.builder().email("pattemvenkataramana886@gmail.com").build();
		System.out.println(p1);
	}

}
