import java.util.*;

class CompareTo{
	
	
	void compare(int a,int b) {
		
		if(a>b)
		{
			System.out.println(a+"is greater of"+b);
		}
		else {
			System.out.println(b+"is greater of"+a);
		}
	}
	void compare(char a,char b)
	{
		int n=Character.compare(a, b);
		if(n>0)
		{
			System.out.println(a+"is greater numberic "+b);
		}
		else {
			System.out.println(b+"is greate numberic: "+a);
		}
	}
	void compare(String s1,String s2)
	{
		int n1=s1.length();
		int n2=s2.length();
		if(n1>n2)
		{
			System.out.println(s1);
		}
		else {
			System.out.println(s2);
		}
	}
	
}
public class CompareToMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareTo ct=new CompareTo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String s1=sc.next();
		String s2=sc.next();
		ct.compare(s1, s2);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ct.compare(a, b);
		System.out.println("Enter characters");
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		ct.compare(c1, c2);
		
		
		
	}

}
