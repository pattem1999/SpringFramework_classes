package com.SpringDemo.Model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ProductRetrieve {

	
	private String pname;
	
	private String category;

	public ProductRetrieve(String pname, String category) {
		super();
		this.pname = pname;
		this.category = category;
	}
	
	
}
