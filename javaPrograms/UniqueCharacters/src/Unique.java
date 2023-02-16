import java.util.*;
public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter string");
		String s1=sc.next();
		int l=s1.length();
		char ch1,ch2;
		int n=0;
		for(int i=0;i<l-2;i++)
		{
			ch1=s1.charAt(i);
			for(int j=i+1;j<l-1;j++)
			{
				ch2=s1.charAt(j);
				if(ch1==ch2)
				{
					n++;
				}
			}
		}
		
		if(n>0)
		{
			System.out.println("it is not unique");
		}
		else
		{
			System.out.println("it's unique");
		}
			
	}

}
