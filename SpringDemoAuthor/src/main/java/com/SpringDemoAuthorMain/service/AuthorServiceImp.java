package com.SpringDemoAuthorMain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDemoAuthorMain.AuthorRepository;
import com.SpringDemoAuthorMain.model.Author;

@Service
public class AuthorServiceImp implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;
	@Override
	public void addAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.save(author);
		System.out.println("inserted");
	}
	@Override
	public void addAuthor(List<Author> author) {
		// TODO Auto-generated method stub
		authorRepository.saveAll(author);
		System.out.println("all date inserted");
	}
	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		Optional<Author> ar=authorRepository.findById(id);
		System.out.println(ar);
	}

	
	
}
