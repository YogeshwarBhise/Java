import java.lang.*;

/*
class Object
{
	//Contents	
}
*/

class Base //Class Base extends Base
{
	public int i;
	public int j;
	
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}

class Derived extends Base
{
	public int x;
	public int y;
	
	public void gun()
	{
		System.out.println("Inside Base gun");
	}
}

class Derivedx extends Derived
{
	public int a;
	
	public void sun()
	{
		System.out.println("Inside Base sun");
	}
}

class Inhert4
{
	System.out.println("Inside Main");
	
}