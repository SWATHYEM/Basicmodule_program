package letter;

import java.util.Scanner;

public class Letter {

	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of letters in your name:");
		int n=ss.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
		 f=f*i;	
		}
	System.out.println(f);
}
}