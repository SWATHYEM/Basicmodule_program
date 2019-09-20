package arrage;

import java.util.Scanner;

public class Arrange {
	
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number students");
		int n=ss.nextInt();
		System.out.println("Enter the height");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		     
			}
		 
	   }
	    
		for(int i=0;i<n;i++)
		
		System.out.println(a[i]);
		}

}