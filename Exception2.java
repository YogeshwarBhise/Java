import java.lang.*;
import java.util.*;

class Exception2
{
	public static void main(String args[])
	{
		int ans = 0,No1 = 0,No2 = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		No1 = sobj.nextInt();
		
		System.out.println("Enter th second number");
		No2 = sobj.nextInt();
		
		try
		{
			ans = No1/No2; //Exception Prone Code
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured as :"+obj);
		}
		finally //It runs whether or not exception occurs
		{
			sobj.close();
		}
		
		System.out.println("Division is: "+ans);
		
	}
}