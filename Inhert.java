import java.lang.*;

class Base1
{
	public int i;
	public int j;
	
	public Base1(int a, int b)
	{
		System.out.println("Inside Base Constructor");
		this.i = a;
		this.j = b;
	}
	
	public void fun()
	{
		System.out.println("Inside Base Fun");
	}
}

class Derived1 extends Base1
{
	public int x;
	public int y;
	
	public Derived1()
	{
		super(11,21);
		System.out.println("Inside Derived1 Cinstructor");
		this.x = 30;
		this.y = 40;
	}
	
	public void sun()
	{
		System.out.println("Inside Derived1 sun");
		System.out.println(super.i);
		super.fun();
	}
}

class Inhert
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		Derived1 obj = new Derived1();
		obj.sun();
	}
}