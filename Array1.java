import java.lang.*;

class Array1
{
	public static void main(String args[])
	{
		int iCnt = 0;
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("Size of array"+arr.length);
		System.out.println("Elementsof array"+arr);
	
		System.out.println("Data by for Loop");
		for(iCnt = 0;iCnt<arr.length;iCnt++)
		{
			System.out.println("Elements of array as their Index: "+arr[iCnt]);
		}
		
		System.out.println("Data by While loop");
		iCnt = 0;
		
		while(iCnt<arr.length)
		{
			System.out.println("Elements of array as their Index:"+arr[iCnt]);
			iCnt++;
		}
		
		System.out.println("Data by for Each Loop");
		for(int no:arr)
		{
			System.out.println(no);
		}
	}
}