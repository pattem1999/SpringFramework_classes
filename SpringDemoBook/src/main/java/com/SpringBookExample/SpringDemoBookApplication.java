package com.SpringBookExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBookExample.dataRepositry.BookDaoImp;

@SpringBootApplication
public class SpringDemoBookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ac;
		BookDaoImp bi=new BookDaoImp();
		
		Book b1=new Book();
		b1.setBookid(100);
		b1.setBookname("java");
		b1.setPublisher("ramana");
		b1.setCategory("engineering");
		b1.setPrice(1000);
		
		bi.addBook(Book b1);
	}

}
