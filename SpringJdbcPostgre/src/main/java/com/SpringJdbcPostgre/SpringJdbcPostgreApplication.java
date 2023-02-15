package com.SpringJdbcPostgre;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class SpringJdbcPostgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcPostgreApplication.class, args);
		
	
	}

}
