package average;

import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n=ss.nextInt();
		System.out.println("Enter the Mark");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
		}
		int sum=0;
		float avg;
		for(int i=0;i<n;i++)
		{
		sum=sum+a[i];
		}
		avg=sum/n;
		System.out.printf(avg);
	}
	

}
