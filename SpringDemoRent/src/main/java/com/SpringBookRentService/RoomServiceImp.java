package com.SpringBookRentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBookRent.Rent;
import com.SpringBookRentRepository.RentDaoImp;

@Service
public class RoomServiceImp implements RoomService{
	@Autowired
	RentDaoImp rdao;
	@Override
	public void addRoom(Rent r) {
		// TODO Auto-generated method stub
		rdao.addRoom(r);
	}
	@Override
	

	public void update() {
		// TODO Auto-generated method stub
		rdao.update();
	}
	
	@Override
	public List<Rent> searchRentRange(double x, double y) {
		// TODO Auto-generated method stub
		return rdao.searchRentRange(x, y);
	}
	@Override
	public void searchById(int id) {
		// TODO Auto-generated method stub
		rdao.searchById(id);
	}

	
}
