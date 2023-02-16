import java.io.IOException;
import java.util.*;
class  FindLengthString
{
	public static void length1()
	{
		Scanner sc=new Scanner(System.in);
		int size=100;
		int count=0,i=0;
		boolean floag=true;
		char ch[]=new char[size];
		System.out.println("enter your string ");
//		for(int i=0;i<size;i++)
//		{
//			
//			
//				//ch[i]=(char)System.in.read();
//				ch[i]=sc.next().charAt(0);
//				char ch1=ch[i];
//			    
//			    char ch2=10;
//				if(ch1!=ch2)
//				{
//					count=count+1;
//					//break;
//					//continue;
//				}
//				else {
//					
//					break;
//				}
//				
//		}
		
		while(floag)
        {
            ch[i]=sc.next().charAt(0);
            count++;
            if((int)ch[i]==13)
            {
                floag=false;
                break;
            }
        }
		
//		for(int i=0;i<count-1;i++) {
//            if(ch[i]!=0x0A) {
//                System.out.print(ch[i]);
//            }
//        }
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println((count-1));
	}



}
public class FindLengthStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FindLengthString.length1();
	}

}
