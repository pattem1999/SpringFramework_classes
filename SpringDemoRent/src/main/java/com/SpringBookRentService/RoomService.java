package com.SpringBookRentService;

import java.util.List;

import com.SpringBookRent.Rent;

public interface RoomService {
	
	public void addRoom(Rent r);
	
	//public Rent searchByType(String type);
	
	public void update();
	
	public List<Rent> searchRentRange(double x,double y);
	
	public void searchById(int id);
}
