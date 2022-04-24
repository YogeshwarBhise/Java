import java.lang.*;

class Base
{
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
	public final void gun()
	{
		System.out.println("Inside Base gun");
	}
}

class Derived extends Base
{
	public void fun() //Overriding
	{
		System.out.println("Inside Derived fun");
	}
	/*public void gun() //Not Alllowed
	{
		System.out.println("Inside Derived gun");
	}*/
	
}

class Final2
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		Derived dobj = new Derived();
		dobj.fun(); //Inside Derived fun
		dobj.gun(); //Inside Base gun
	}
}