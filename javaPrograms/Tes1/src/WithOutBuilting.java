/*try to do without any buliding function*/
import java.io.BufferedReader;
import java.util.*;
public class WithOutBuilting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
//		BufferedReader ob=new BufferedReader(new )
//		int size=30;
//		int count=0;
//		char[] ch=new char[30];
//		char[] ch1=new char[25];
//		//ch1= {'A'};
//	    ch[0]='r';
//		ch[1]='a';
//		ch[2]='m';
//		ch[3]='a';
//		ch[4]='n';
//		ch[5]='a';
//		for(int i=0;i<size;i++)
//		{
//			if(ch[i]!='\0')
//			{
//			System.out.println(ch[i]+"  index "+i);
//			count++;
//			}
//		}
//		System.out.println(ch);
//		System.out.println("the length if the array :- "+count);
//		//String s1=
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter name and end of the name give dot");
	        char ch[]=new char[100];
	        int count=0;
	        boolean b=false;
	        for(int i=0;i<100;i++) {
	            ch[i]=sc.next().charAt(0);
	            count++;
	            if(ch[i]==0x0A)
	            {
	                break;
	            }
	        }
	        for(int i=0;i<count-1;i++) {
	            if(ch[i]!=' ') {
	                System.out.print(ch[i]);
	            }
	        }
	        System.out.println();
	        System.out.println("length of string is:"+(count-1));
	}

}
