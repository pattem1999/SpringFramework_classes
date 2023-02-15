package com.SpringDemoBook1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringDemoBook1.Book;
@SpringBootConfiguration
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  ac=new AnnotationConfigApplicationContext("com.SpringDemoBook1Service");
		
		Book b1=ac.getBean(Book.class,"book");
		
		b1.setBid(100);
		b1.setBname("java");
		b1.setPublisher("ramana");
		b1.setCategory("engineering");
		b1.setPrice(1000);
		
		BookDaoImp bi=ac.getBean(BookDaoImp.class,"bookimplement");
		bi.add(b1);
		
	}

}
