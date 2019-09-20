package amstrong;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=ss.nextInt();
		int sum=0;
		int temp1=num;
		int temp=num;
		int c=0;
		while(num!=0)
		{
		 c++;
		 num=num/10;
		 
		}
		while(temp>0)
		{
			int n=temp%10;
			sum= (sum+(int)Math.pow(n,c));
			temp=temp/10;
			
		}
		if(temp1==sum)
		{
		 System.out.println("Given number is amstrong number");
			
		}
		else
		{
			System.out.println("Given number is not an amstrong number");
		}
		
	}

}
