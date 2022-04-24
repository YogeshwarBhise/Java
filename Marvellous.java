import java.lang.*;

class Demo
{
	public int i;
	public int j;
	
	public Demo() //public Demo(Demo *this)
	{
		this.i = 0;
		this.j = 0;
	}
	
	public Demo(int x, int y) //public Demo(Demo *this)
	{
		this.i = x;
		this.j = y;
	}
	
	public void fun()
	{
		System.out.println("Inside fun");
	}
	
	public void gun()
	{
		System.out.println("Inside gun");
	}
}

class Marvellous
{
	public static void main(String arr[])
	{
		System.out.println("Inside Main");
		//Demo obj; for c++
		Demo obj = new Demo();
		obj.fun(); //fun(obj);
		obj.gun(); //gun(obj);
		System.out.println(obj.i);
		
		Demo objx = new Demo(11,21);
		objx.fun(); //fun(obj);
		objx.gun(); //gun(obj);
		System.out.println(objx.i);
	}
}

//there is no need of ; at the end of class 
//bcoz everything is by default class in java