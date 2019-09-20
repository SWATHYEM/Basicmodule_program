package mark;

import java.util.Scanner;

public class Mark
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
		int c=0;
		for(int i=0;i<n;i++)
		{
		if(a[i]<45)
		{
           c++;
		}
          
		}
		 System.out.println(c);
		}
}