import java.lang.*;
import java.util.*;

class Array2
{
	public static void main(String args[])
	{
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter The number of Elements: ");
		int Size = sobj.nextInt();
		
	int Arr[] = new int[Size];
		
		System.out.println("Enter the elements of array: ");
		for(iCnt = 0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		System.out.println("Elements of array are: ");
		for(iCnt = 0;iCnt<Arr.length;iCnt++)
		{
		System.out.println(Arr[iCnt]);
		}
	}
}
