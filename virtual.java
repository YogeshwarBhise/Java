import java.lang.*;

class Base
{
	public int i,j;
	public void fun()	//Defination
	{
		System.out.println("Base fun");
	}
	public void gun() 	//Defination
	{
		System.out.println("Base gun");
	}
	public void sun()	//Defination
	{
		System.out.println("Base sun");
	}
}

class Derived extends Base
{
	public int x,y;
	
	public void fun() //Overriding
	{
		System.out.println("Derived fun");
	}
	public void sun() //Overriding
	{
		System.out.println("Derived sun");
	}
	public void run() //Defination
	{
		System.out.println("Derived run");
	}
}

class virtual
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
//		Base bobj = new Base(); // no casting
//		Derived dobj = new Derived(); //no casting
	
		Base bobj1 = new Derived(); //upcasting   Base *bp = new Derived();
//		Derived dobj1 = new Base(); //downcasting
	
		bobj1.fun(); //Derived Fun //bp->fun();
		bobj1.gun(); //Base gun
		bobj1.sun(); //Derived sun
	//	bobj1.run();
	}
}