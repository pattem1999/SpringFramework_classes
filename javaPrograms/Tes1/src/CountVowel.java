import java.util.*;
public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char[] a=new char[30];
		int count=0,count1=0;
		System.out.println("enter character");
		for(int i=0;i<30;i++)
		{
			a[i]=sc.next().charAt(0);
			if((a[i]>='a' && a[i]<='z') ||(a[i]>='a' && a[i]<='z'))
			{
				if(a[i]=='a'||a[i]=='i'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='I'||a[i]=='E'||a[i]=='O'||a[i]=='U')
				{
					count=count+1;
				}
				else
				{
					count1=count1+1;
				}
			}
			if(a[i]=='.')
			{
				break;
			}
		}
		
		System.out.println("count of vowels"+count);
		System.out.println("count of constants"+count1);
	}

}
