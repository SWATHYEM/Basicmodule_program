package fib;

import java.util.Scanner;

public class Fib 
{
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter number");
		int n=ss.nextInt();	
		 int a=0,b=1;
		 System.out.println(a);
		 System.out.println(b);
		for(int i=0;i<=n;i++)
		{
		
		  int c=a+b;
		    a=b;
		    b=c;
		    System.out.println(c);
		 
		}

}
}
