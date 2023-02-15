package com.SpringBookExample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Book {

	private int bookid;
	private String bookname;
	
	private String publisher;
	
	private String category ;
	public double price;
	
	
}
