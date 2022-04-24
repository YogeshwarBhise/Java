import java.lang.*;
import java.util.*;

class Exception1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int No1 = sobj.nextInt();
		
		System.out.println("Enter th second number");
		int No2 = sobj.nextInt();
		
		int ans = No1/No2;
		
		System.out.println("Division is: "+ans);
		sobj.close();
	}
}