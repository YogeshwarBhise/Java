import java.lang.*;
import java.util.*;

class Exception3
{
	public static void main(String args[])
	{
		int Arr[] = {10,20,30,40,50}; //int Arr[] = new int[5];
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the index");
		int index = sobj.nextInt();
		
		System.out.println("Element at that index is: "+Arr[index]);
	}
}