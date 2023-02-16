import java.util.*;
class CountNotes
{
	
	public static void checkNotes(int notes)
	{
		Scanner sc=new Scanner(System.in);
		int amount=notes;
		int temp;
		int i=0;
		do {
			i=0;
		if(amount>=2000)
		{
			temp=amount/2000;
			amount=amount-(temp*2000);
			System.out.println("the notes of 2000 is:-"+temp);
		}
		if(amount>=500 && amount<2000) {
			temp=amount/500;
			amount=amount-(temp*500);
			System.out.println("the notes of 500 is:-"+temp);
		}
	    if(amount>=200 && amount<500)
	    {
	    	temp=amount/200;
	    	amount=amount-(temp*200);
	    	System.out.println("the notes of 200 is:-"+temp);
	    	
	    }
	    if(amount>=100 && amount<200)
	    {
	    	temp=amount/100;
	    	amount=amount-(temp*100);
	    	System.out.println("the notes of 100 is:-"+temp);
	    }
	    if(amount>=50 && amount<100)
	    {
	    	temp=amount/50;
	    	amount=amount-(temp*50);
	    	System.out.println("the notes of 50 is:-"+temp);
	    }
	    if(amount>=20 && amount<50)
	    {
	    	temp=amount/20;
	    	amount=amount-(temp*20);
	    	System.out.println("the notes of 20 is:-"+temp);
	    }
	    if(amount>=10 && amount<20)
	    {
	    	temp=amount/10;
	    	amount=amount-(temp*10);
	    	System.out.println("the notes of 10 is:-"+temp);
	    }
	    if(amount>5 && amount<10)
	    {
	    	temp=amount/5;
	    	amount=amount-(temp*5);
	    	System.out.println("the notes of 5 is:-"+temp);
	    }
	    System.out.println("enter amount");
	    amount=sc.nextInt();
	    i=1;
		}while(i==1);
		
	}
}
public class CountNotesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter amount");
		int i=sc.nextInt();
		CountNotes.checkNotes(i);
		
	}

}
