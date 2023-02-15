package com.SpringBookRent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBookRentService.RoomServiceImp;

@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBookRentRepository,com.SpringBookRentService")
public class SpringDemoRentApplication  implements CommandLineRunner{

	public  static void main(String[] args) {
		SpringApplication.run(SpringDemoRentApplication.class, args);
	}
	@Autowired
	RoomServiceImp rsimp;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	Room r=new Room()
		//rsimp.addRoom(new Rent("narendra","Bachlor",1232145,"Room","Dwaraka nagar",10000,6000,"Sector2","3BHK","vizag"));	
		
	
	   //rsimp.searchByType("pentHouse");
		//rsimp.update();
		rsimp.searchById(1232145);
		
		System.out.println(rsimp.searchRentRange(900, 2000));
	}

}
