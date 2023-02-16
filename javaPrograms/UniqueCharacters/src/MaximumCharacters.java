import java.util.*;
class Maximum{
	//int[] a=new int[10];
	
	public static void  maxChar(String s)
	{ 
		char[] ch=new char[s.length()];
		ch=s.toCharArray();
		int i,j;
		char ch1;
		int count=0,freq=0;
		ArrayList<Integer> s1=new ArrayList<>();
		ArrayList<Character> s2=new ArrayList<>();
		
		for(i=0;i<s.length();i++)
		{
	
			for(j=i;j<s.length();j++)
			{
				
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!=0 )
				{
					//ch[i]=ch[j+1];
					//s.length()=s.length()-1;
					count=count+1;
				}
			}
			
		
		if(count>freq)
			{
				freq=count;
				ch1=(char)ch[i];
				s1.add(freq);
				//System.out.println(s1);
				s2.add(ch1);
				//System.out.println(s2);
			}
			count=0;
		}

		System.out.println(s1);
		System.out.println(s2);
		Iterator it=s1.iterator();
		Iterator it1=s2.iterator();
		
		while(it.hasNext())
		{
			while(it1.hasNext())
					{
				
					System.out.println("the maximum number of it"+it.next()+"  "+it1.next());
				}
		}
		
	}

	
			
}
public class MaximumCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int n=s.length();
		//int count=0;
		Maximum.maxChar(s);
	}

}
