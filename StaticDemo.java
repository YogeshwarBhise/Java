import java.lang.*;

class Demo
{
	public int i;
	public int j;
	public static int k;
	
	static
	{
		System.out.println("Inside Static Block ");
		k  = 11;
	}
	
	public Demo()
	{
		System.out.println("Inside Constructor");
		this.i = 0;
		this.j = 0;
	}
	
	public void fun()
	{
		System.out.println("Inside non-Static fun");
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);
	}
	
	public static void gun()
	{
		System.out.println("Inside Static gun");
		System.out.println(k);


	}
}

class StaticDemo
{
	public static void main(String args[])
	{
		
		System.out.println("Inside Main");
	
		//Before creating object
		Demo.gun();
		
		//After creating object
		Demo obj; // only reference no memory
		obj = new Demo();
	/*	obj.fun();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
	
	*/
	}
}