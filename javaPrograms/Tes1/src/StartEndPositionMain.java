import java.util.*;
class StartEndPosition{
	
	public static String StartAndEnd(char[] ch,int n1,int n2)
	{
		String s1="";
		for(int i=n1;i<n2;i++)
		{
			s1=s1+ch[i];
		}
		
		return s1;
	}
	Object[] ob=new Object[5];
}
public class StartEndPositionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter string");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		System.out.println("please enter start position");
		int n1=sc.nextInt();
		System.out.println("please enter end position");
		int n2=sc.nextInt();
		System.out.println("the starting and ending positions  "+n1+"   and   "+n2+"--->"+StartEndPosition.StartAndEnd(ch, n1, n2));
	}

}
