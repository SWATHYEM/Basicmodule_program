package io;
import java.util.Scanner;
public class Input
{
 public static void main(String[] args)
 {
 String Name;
 String Age;
 String Degree;
 String Branch;
 String ContactNumber;
 Scanner ss=new Scanner(System.in);
 System.out.println("Enter your Name:");
 Name=ss.nextLine();
 System.out.println("Enter your Age:");
 Age=ss.nextLine();
 System.out.println("Enter your Degree:");
 Degree=ss.nextLine();
 System.out.println("Enter your Branch:");
 Branch=ss.nextLine();
 System.out.println("Enter your ContactNumber:");
 ContactNumber=ss.nextLine();
 System.out.println("Name :"+Name);
 System.out.println("Age :"+Age);
 System.out.println("Degree :"+Degree);
 System.out.println("Branch :"+Branch);
 System.out.println("ContactNumber :"+ContactNumber);
 }
 
}
