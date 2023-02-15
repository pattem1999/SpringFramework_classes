package com.SpringDemoTwoTable.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lid;
	private String lname;
	private Double price;
	
	@OneToOne(mappedBy = "laptop"   ,cascade = CascadeType.ALL)
	Student st;
	
}
