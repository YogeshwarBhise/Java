import java.lang.*;
import java.util.*;

class Array4
{
	public static void main(String args[])
	{
		int i,j = 0;
		//arr is a 2  dimensional array which contains 2 one dimensional arrays
		//each one dimensional array conatins 3 elements and each element
		//is of type integer.
		int arr[][] = new int [2][3];

		arr[0][0] = 11;
		arr[0][1] = 21;
		arr[0][2] = 51;
		arr[1][0] = 101;
		arr[1][1] = 111;
		arr[1][2] = 121;
		//	1		2			3	
		for(i = 0;i < arr.length;i++) //Outer
		{//		1		2				3
			for(j = 0;j < arr[i].length;j++)//Inner
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}
}
