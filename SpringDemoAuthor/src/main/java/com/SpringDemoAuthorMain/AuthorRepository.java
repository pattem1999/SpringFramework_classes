package com.SpringDemoAuthorMain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDemoAuthorMain.model.Author;

@Repository
public interface AuthorRepository  extends JpaRepository<Author, Integer>{
	

}
