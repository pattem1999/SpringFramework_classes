package com.SpringDemoBook1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SpringDemoBook1.Book;

@Component("bookimplement")
@Repository
public class BookDaoImp  implements BookDao{
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void add(Book bk) {
		// TODO Auto-generated method stub
		String s1="insert into book values(?,?,?,?,?)";
		
		Object[] args= {bk.getBid(),bk.getBname(),bk.getPublisher(),bk.getCategory(),bk.getPrice()};
		
		jdbc.update(s1,args);
		System.out.println("inset into date");
	}

}
