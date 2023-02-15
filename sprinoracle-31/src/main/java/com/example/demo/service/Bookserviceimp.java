package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Book;
import com.example.demo.repository.Bookdao;
import com.example.demo.service.Bookservice;
@Service
public class Bookserviceimp implements Bookservice {
	@Autowired
	Bookdao bookdao;

	public Bookdao getBookdao() {
		return bookdao;
	}

	public void setBookdao(Bookdao bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public void addbook(Book b) {
		
    bookdao.addbook(b);
	}

//	@Override
//	public void deletebook(Book b) {
//		// TODO Auto-generated method stub
//bookdao.deletebook(b);
//	}
//
//	@Override
	public List<Book> getallbooks(Book b) {
		// TODO Auto-generated method stub
		return bookdao.getallbooks(b);
	}

}
