import java.io.*;

class Buffered4
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter String");
		String str = bobj.readLine();
		
		System.out.println("Enter Integer");
		int no = Integer.parseInt(bobj.readLine()); //Integer is wrapper class and parseInt is a static method in it.
		
		System.out.println("Enter Float");
		float f = Float.parseFloat(bobj.readLine()); //Float is wrapper class and parseFloat is a static method in it.
		
		System.out.println("Enter Double");
		double d = Double.parseDouble(bobj.readLine()); //Double is wrapper class and parseDouble is a static method in it.

		System.out.println("Entered String: "+str);
		System.out.println("Entered Integer: "+no);
		System.out.println("Entered Float: "+f);
		System.out.println("Entered Double: "+d);
	}
}