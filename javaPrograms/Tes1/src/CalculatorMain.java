import java.util.*;
public class CalculatorMain {

	public static int add(int a,int b)
	{
		return a+b;
		
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	
	public static int mul(int a ,int b)
	{
		
		return a*b;
	}
	public static double div(int a, int b)
	{
		return a/b;
	}
	public static float mod(int a ,int b) {
		return a%b;
	}
	
	
	public static double sin(double op,double hyp)
	{
		return op/hyp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b for addition");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.add(a, b));
		System.out.println("===================************==========================");
		System.out.println("enter a and b for  substraction");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.sub(a, b));
		System.out.println("===================************==========================");
		System.out.println("enter a and b for  multiplication");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.mul(a, b));
		System.out.println("===================************==========================");
		System.out.println("enter a and b for  division");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.div(a, b));
		System.out.println("===================************==========================");
		System.out.println("enter a and b for  division");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.mod(a, b));
		System.out.println("===================************==========================");
		System.out.println("enter a and b for  hyposiness and opposite side ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of two numbers:-\t"+CalculatorMain.sin(a, b));
		
		
	}

}
