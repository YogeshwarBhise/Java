import java.lang.*;
import java.io.*; //Needed for BufferedReader

class Buffered2
{
	public static void main(String args[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		try//Exception Prone Code
		{
		System.out.println("Enter Your Name: ");
		String name = bobj.readLine();
		
		System.out.println("Your name is: "+name);
		}
		catch(IOException obj)
		{
			System.out.println("An Exception Occurs");
		}
		finally
		{
			iobj=null; //Point the reference to 0 then Garbage collector can free them knowing no one is using it now
			bobj=null; //Point the reference to 0 then Garbage collector can free them knowing no one is using it now
		}
	}													
}