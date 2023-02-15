package com.SpringJdbc1;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("application.xml");
		Config cg=con.getBean("dataSource",Config.class);
		
		JdbcTemplate jdbc=new JdbcTemplate((DataSource) cg);
		
		
	}

}
