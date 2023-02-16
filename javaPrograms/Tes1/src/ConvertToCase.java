import java.util.*;
public class ConvertToCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String result=" ";
		char temchar;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			temchar=str.charAt(i);
			if(temchar>='a' && temchar<='z')
			{
				temchar=Character.toUpperCase(temchar);
				//temchar=
				result=result+temchar;
			}
			else if(temchar>='A' && temchar<='Z')
			{
				temchar=Character.toLowerCase(temchar);
				result=result+temchar;
			}
			else {
				result=result+temchar;
			}
		}
		
		System.out.println("String conversion from "+result);
	}

}
