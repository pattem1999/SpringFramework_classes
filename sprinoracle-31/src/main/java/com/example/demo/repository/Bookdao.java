package com.example.demo.repository;

import java.util.List;

import com.example.demo.Book;

public interface Bookdao {
	public void addbook(Book b);
	//public void updatebook(Book b);
	public void deletebook(Book b);
	public List<Book>getallbooks(Book b);
//	public Book getByid(int id);
//	public List<Book>getbycat(String c);
}
