import java.lang.*;
import java.io.*;

class Wrapper
{
	public static void main(String args[]) throws IOException
	{
		int no = 11; //Primitive 
		
		Integer iobj = new Integer(11); //Wrapper class
	
		int i = iobj; //Unboxing
	
		Integer iobj2 = no; //Boxing
		
		System.out.println(no);
		System.out.println(iobj);
		System.out.println(i);
		System.out.println(iobj2);
		//System.out.println();
	}
}