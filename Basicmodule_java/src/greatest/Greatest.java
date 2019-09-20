package greatest;

import java.util.Scanner;

public class Greatest {
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=ss.nextInt();
		System.out.println("Enter the numbers:");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
		}
	   int large=a[0];
	   for(int i=0;i<n;i++)
	   { 
		   
	   if(large<a[i+1]) 
	   {
		   large=a[i+1];
	   }

    }
	  System.out.println("Greatest number is :"+large);
	}
}
