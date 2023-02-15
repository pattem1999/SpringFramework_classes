package com.SpringDemoBook1;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Book {

	private int bid;
	
	private String bname;
	
	private String publisher;
	
	private String category;
	
	private double price;
	
}
