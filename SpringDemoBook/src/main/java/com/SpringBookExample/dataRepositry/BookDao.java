package com.SpringBookExample.dataRepositry;

import java.util.List;

import com.SpringBookExample.Book;

public interface BookDao {

void addBook();
	
	void updateBook();
	
	void deleteBook();
	
	List<Book> printAllBook();
	Book getById(int id);
	
	List<Book> Category(String c);
}
