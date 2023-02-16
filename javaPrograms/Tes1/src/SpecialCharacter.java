import java.util.*;
public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String s=sc.nextLine();
		char ch;
		String word="";
		int len=s.length();
		
		for(int i=0;i<len;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
			{	//word=word+ch;
				char ch1='*';
				word=word+ch1;
				//System.out.println();
			}
			else {
				word=word+ch;
			}
		}
		System.out.println(word);
	}

}
