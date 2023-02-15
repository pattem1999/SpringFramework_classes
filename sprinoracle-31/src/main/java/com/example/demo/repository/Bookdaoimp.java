package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.Book;
import com.example.demo.repository.Bookdao;

import lombok.Setter;
@Repository
public class Bookdaoimp implements Bookdao {

	@Autowired
	@Setter
	JdbcTemplate jdbc;

	@Override
	public void addbook(Book b) {
		String sql="insert into book values(?,?,?,?,?)";
		Object args[]= {b.getBid(),b.getBname(),b.getPublisher(),b.getCat(),b.getPrice()};
		jdbc.update(sql,args);
		
	}

	

	@Override
	public void deletebook(Book b) {
	String sql="delete from book where where bid=?";
	Object args[]= {b.getBid()};
	jdbc.update(sql,args);
	
	}

	@Override
	public List<Book> getallbooks(Book b) {
		String sql="select * from book";
		List<Book>blist=jdbc.query(sql,new RowMapper<Book>(){
			@Override
			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				Book b=new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPublisher(rs.getString(3));
				b.setCat(rs.getString(4));
				b.setPrice(rs.getInt(5));
				return b;
			}
			
		});
		return blist;
		
	}
	

	
}
