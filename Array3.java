import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String args[])
	{
		int iCnt = 0;
		int Size = 0;
			
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of elements you want :");
		Size  = sobj.nextInt();
		
		int Arr[] = new int[Size];
		
		System.out.println("Enter Elements");
		for(iCnt = 0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	
		System.out.println("Elements");
		for(iCnt = 0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	
	}
}