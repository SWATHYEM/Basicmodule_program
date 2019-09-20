package leap;

import java.util.Scanner;

 public class Leap {
	
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the year:");
		int n=ss.nextInt();
		if(n%4==0)
		{
		  System.out.println("leap year");
		 
		}
		else if(n%100==0)
		{
			System.out.println("not leap year");
			
		}
		else
		{
			System.out.println("not leap year");	
		}
}
}