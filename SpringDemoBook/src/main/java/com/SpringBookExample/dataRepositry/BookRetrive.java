package com.SpringBookExample.dataRepositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.SpringBookExample.Book;

public class BookRetrive implements org.springframework.jdbc.core.RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book bk=new Book();
		bk.setBookid(rs.getInt("bookid"));
		bk.setBookname(rs.getString("bookname"));
		bk.setPublisher(rs.getString("publisher"));;
		bk.setCategory(rs.getString("category"));
		bk.setPrice(rs.getDouble("price"));
		
		return bk;
	}

	
}
