import java.lang.*;
import java.io.*;

class StringX
{
	public static void main(String args[])
	{
		//String literal(Pool)
		String str1 = "Hello";//Memory allocated in String Constant Pool
		String str2 = "World";//Memory allocated in String Constant Pool
	
		System.out.println(str1); //Hello
		System.out.println(str1.length()); //5
		
		String str3 = str1 + str2;
		System.out.println(str3); //HelloWorld
	
		String str4 = "Hello";
	
	
		//String Objects
		String str5 = new String("Hello");
		String str6 = new String("World");
		String str7 = new String("Hello");
	}
}

//Memory is shared in String Literal if the data is same and constant.