package com.SpringBookRent;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Rent {

	private String name;
	private String category;
	
	private int pid;
	private String type;
	private String area;
	private double rentExpected;
	
	private double securitydeposite;
	
	private String location;
	
	private String bedrooms;
	
	private String city;
	
}
