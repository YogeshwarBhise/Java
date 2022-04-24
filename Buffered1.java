import java.lang.*;
import java.io.*; //Needed for BufferedReader

class Buffered1
{
	public static void main(String args[]) throws IOException //whole main is Exception Prone Code
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter Your Name: ");
		String name = bobj.readLine();
		
		System.out.println("Your name is: "+name);
	}													
}//The main function throws IOException and so we dont get error at compile time
