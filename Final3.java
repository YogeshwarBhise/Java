//we cant inherit base class boz its final
// we can overcome that using composite concept
import java.lang.*;

final class Base
{
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}

/*class Derived extends Base 	//Not Allowed
{

}
*/

class Derived
{
	public Base bobj = new Base(); //Composition
	
	public void gun()
	{
		System.out.println("Derived gun");
	}
}
class Final3
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		Derived dobj = new Derived();
		dobj.bobj.fun();
		dobj.gun();
	}
}