//WAP to extract a substring from the string where the start & end position was mentioned buy the user donot use inbuil function
//WAP to remove all characters from strings except alphabets
//vandana 23 is 34 taking a session
//op:-vandana is taking a session
//WAP to read an amount and break the amount in the smallest possible number of notes


import java.util.*;
class Hotel{
	Scanner sc=new Scanner(System.in);
	List<Integer>hotelid;
	String  hotelname;
	String address;
	List<String> menu;
	//menu.add("chatati");
	
	public Hotel(List<Integer> n, String name, String add, List<String> menu2) {
		// TODO Auto-generated constructor stub
		this.hotelid=n;
		this.hotelname=name;
		this.address=add;
		this.menu=menu2;
	}
	void foodMenu() 
	{
		Iterator<Integer> hotel_id=hotelid.iterator();
		int i=0;
		while(hotel_id.hasNext())
		{
			System.out.println(hotel_id.next());
		}
		System.out.println("please enter hotel id");
		int hid=sc.nextInt();
		do {
			
		if(hotelid.contains(hid))
		{
			System.out.println("food menu");
			//int i=1;
			Iterator<String> str=menu.iterator();
			while(str.hasNext())
			{
				System.out.println(str.next());
				
			}
			i=0;
		}
		else {
			System.out.println("choose right hotel id");
			hid=sc.nextInt();
			 i=1;
		}
		
		}while(i==1);
	}

}
public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter hotel id");
		// n=sc.nextInt();
		List<Integer>id=new ArrayList<>();
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		System.out.println("enter hotel name");
		String name=sc.next();
		System.out.println("enter address");
		String add=sc.next();
		//System.out.println("enter the menu");
		List<String> menu= new ArrayList<>();
		menu.add("TTTTT");
		menu.add("RRRRR");
		menu.add("FFFFF");
		Hotel h=new Hotel(id,name,add,menu);
		
		
		h.foodMenu();
		
	}

}
