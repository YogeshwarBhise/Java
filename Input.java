import java.lang.*; 
import java.util.*; //import java.util.Scanner;

class Input
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Please enter Your Name: ");
		String name = sobj.nextLine();
		
		System.out.println("Please enter Your Age: ");
		int Age = sobj.nextInt();

		System.out.println("Please enter Your Percentage: ");
		float Percentage = sobj.nextFloat();

		System.out.println("Your Name is :" + name);
		System.out.println("Your Age is :" + Age );
		System.out.println("Your Percentage are :"+Percentage);
		
		sobj.close();
	}
}