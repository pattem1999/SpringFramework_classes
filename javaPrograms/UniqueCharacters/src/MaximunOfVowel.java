/*Accept 10 strings and print the word with maximum no of  vowels.*/
import java.util.*;
class MaximunOfVowel1{
	
	
	public static void accept()
	{
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[5];
		int count=0,freq=0;
		char ch = ' ';
		char ch1[] = null;
		int i,j;
		String s3=" ";
		ArrayList<Integer> count1=new ArrayList<Integer>();
		ArrayList<Character>ls=new ArrayList<>();
		System.out.println("enter string ");
		for( i=0;i<5;i++)
		{
			 s1[i]=sc.nextLine(); 
		}
		for(i=0;i<5;i++)
		{
			 s3=s1[i];
			ch1=s3.toCharArray();
			for( j=0;j<ch1.length;j++)
			{
				if(ch1[j]=='a'||ch1[j]=='e'||ch1[j]=='o'||ch1[j]=='u')
				{
					count=count+1;
				}
				
			}
		
			if(count>freq)
			{
				freq=count;
				count1.add(freq);
				ch=(char)ch1[j];
				ls.add(ch);
				
			}
			count=0;
		}
		
		System.out.println(count1);
		System.out.println(ls);
		
		System.out.println("the maximun number of "+freq+" "+ch);
	
	}
	
}
public class MaximunOfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximunOfVowel1.accept();

	}

}
