import java.util.*;
class RemoveWithOut1
{
	public static String check(String s1)
	{
		int len=0;
		String s2="";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||ch[i]==' ')
			{
				//ch[i]=ch[i+1];
				s2=s2+ch[i];
				
			}
			
			
		}
		return s2;
		
	}




}
public class RemoveWithOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.nextLine();
	    System.out.println(RemoveWithOut1.check(s1));
		
		
	}

}
