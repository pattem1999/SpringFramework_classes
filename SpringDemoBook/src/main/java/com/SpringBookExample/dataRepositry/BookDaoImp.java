package com.SpringBookExample.dataRepositry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringBookExample.Book;
@Repository
public class BookDaoImp implements BookDao{
	@Autowired
	private JdbcTemplate jdbc;
	@Autowired
	Book b1;
	@Override
	public void addBook(Book b1) {
		// TODO Auto-generated method stub
		String sql="insert into Book values(?,?,?,?,?)";
		Object[] args= {b1.getBookid(),b1.getBookname(),b1.getPublisher(),b1.getCategory(),b1.getPrice()};
		jdbc.update(sql,args);
		System.out.println("data insert successfully");
	}

	@Override
	public void updateBook() {
		// TODO Auto-generated method stub
		/*
		 * String sql ="update book set bookname=? where bookid=?"; // jdbc.update(sql,
		 * bookid); System.out.println("update successfully");
		 */
	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		/*
		 * String sql="delete from book  where bookid=?"; //jdbc.update(sql,bookid);
		 * System.out.println("delete successfully");
		 */
	}

	@Override
	public List<Book> printAllBook() {
		// TODO Auto-generated method stub
		/*
		 * String sql="select * from book"; List<Book> bk=jdbc.query(sql, new
		 * BookRetrive());
		 */
		return null;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		/*
		 * String sql="select * from  book where id=?"; Book bk=jdbc.queryForObject(sql,
		 * new Object[] {id},new BookRetrive());
		 */
		return null;
	}

	@Override
	public List<Book> Category(String c) {
		// TODO Auto-generated method stub
		
		return null;
	}
	

}
