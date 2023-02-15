package com.SpringJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentRetrive  implements RowMapper<Student>{
	
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setSid(rs.getInt("sid"));
		student.setSname(rs.getString("sname"));
		student.setCity(rs.getString("city"));
		return student;
		//return null;
	}
	
	

}
