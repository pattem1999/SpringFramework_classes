package com.SpringDemoAuthorMain.service;

import java.util.List;

import com.SpringDemoAuthorMain.model.Author;

public interface AuthorService {

	void addAuthor(Author author);
	
	
	void addAuthor(List<Author> author);
	
	void getById(int id);
	
}
