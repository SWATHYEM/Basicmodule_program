package fsum;

import java.util.Scanner;

public class Fsum 
{
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n=ss.nextInt();
		if(n<0)
		{
			System.out.println("Enter the number of student");
			 n=ss.nextInt();
		
       }
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
