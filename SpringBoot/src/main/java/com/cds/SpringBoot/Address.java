package com.cds.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int pin;
	private String city;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
