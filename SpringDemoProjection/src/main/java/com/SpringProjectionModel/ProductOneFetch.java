package com.SpringProjectionModel;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class ProductOneFetch {

	private String pname;
	
	private String category;

	public ProductOneFetch(String pname, String category) {
		super();
		this.pname = pname;
		this.category = category;
	}


	
	
	
}
