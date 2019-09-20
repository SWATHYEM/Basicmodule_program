package foul;

import java.util.Scanner;

public class Foul {
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=ss.nextInt();
		System.out.println("Enter the fouls made by each players");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
		}
	    int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<=39)
			{
			 c++;
			}
		}
	   System.out.println("Elegible for nxt match:"+c);
	}
}
