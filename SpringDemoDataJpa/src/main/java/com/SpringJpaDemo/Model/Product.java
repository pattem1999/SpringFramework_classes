package com.SpringJpaDemo.Model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
@Component
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

	public Product(String pname, String brand, String category, Double price) {
		super();
		this.pname = pname;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}
	
	
}
