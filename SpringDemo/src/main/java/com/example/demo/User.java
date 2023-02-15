package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/

@Getter(value = AccessLevel.PUBLIC)
public class User {

	@Getter
	@Setter
	private long id;

	//@Getter(lazy = true)
	@Setter
	private String fname;

	private String lname;

	private int age;

	private String gender;

}
