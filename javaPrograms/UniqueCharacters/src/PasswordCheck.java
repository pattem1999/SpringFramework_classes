import java.util.*;

class Verify1 implements Runnable
{
	Scanner sc=new Scanner(System.in);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("enter username");
		String s1=sc.nextLine();
		char c=s1.charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(s1);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("please contain first letter in vowels");
		}

		System.out.println("enter password");
		String pwd=sc.nextLine();
		int len=pwd.length();
		for(int i=0;i<pwd.length();i++)
		{
			if(len<9)
			{
				System.out.println("password must be contain 9 characters");
			}
			else
			{
				for(int j=0;j<len;j++)
				{
					char c1=pwd.charAt(i);
					if(('a'<=c1 && c1<='z') ||('A'<=c1 && c1<='Z')|| ('0'<=c1&& c1<='9')) {
						
						try {
							Thread.sleep(20000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					}
					else if(Character.isWhitespace(c1))
					System.out.println("password succusfully");
				}
			}
		}
		
		
	}
	
}
public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verify1 v1=new Verify1();
		Thread t=new Thread(v1);
		t.start();
	}

}
