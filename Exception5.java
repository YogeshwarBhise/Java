import java.lang.*;
import java.util.*;

class Demo
{
	public int Division(int no1,int no2) throws ArithmeticException
	{
		return no1/no2;
	}
}

class Exception5
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the First number");
		int no1 = sobj.nextInt();
		
		System.out.println("Enter the Second number");
		int no2 = sobj.nextInt();
	
		Demo dobj = new Demo();
		try
		{
			int iRet = dobj.Division(no1,no2);
			System.out.println("Division is:"+iRet);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Inside Catch");
			System.out.println(obj);
		}
		
	}
}