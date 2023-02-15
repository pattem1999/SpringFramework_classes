package com.example.demo;

import java.util.Scanner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"empid","salary"})
public class Emp {

	Scanner sc=new Scanner(System.in);
	//@Getter
	@NonNull
	private int empid;
	//@ToString(exclude = "ename")
	private String ename;
	
	private double salary;
	
}
