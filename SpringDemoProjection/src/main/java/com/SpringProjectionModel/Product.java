package com.SpringProjectionModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@SequenceGenerator(name = )
	private Integer pid;
	@Column(length = 20)
	private String pname;
	@Column(length = 20)
	private String brand;
	@Column(length = 20)
	private String category;
	
	private Double price;
}
