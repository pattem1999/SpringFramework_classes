package com.SpringJdbcPostgre;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import com.SpringJdbc.Student;

public class EmpImp {

	public static DataSource getSource() {
		String url = "jdbc:postgresql://localhost:5432/SpringJdbcDemo";
		String username = "postgres";
		String password = "1234";
		DataSource datasource = new DriverManagerDataSource(url, username, password);
		return datasource;

	}
	
	private JdbcTemplate jdbc;

	public void insert(Emp e) {
		// TODO Auto-generated method stub
		jdbc = new JdbcTemplate(getSource());

		String sql = "insert into emp values(?,?,?)";
		Object[] args = { e.getEid(), e.getEname(), e.getJob() };
		jdbc.update(sql, args);
		System.out.println("insertion successfully");
	}
}
