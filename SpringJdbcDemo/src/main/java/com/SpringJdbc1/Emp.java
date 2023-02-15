package com.SpringJdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emp {

	//ApplicationContext con=new ClassPathXmlApplicationContext("application.xml");
	
	//Config jdbc=con.getBean("dataSource",Config.class);
	
	private int empno;
	private String ename;
	private String job;
	
	
}
