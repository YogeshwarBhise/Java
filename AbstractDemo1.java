import java.lang.*;

abstract class Demo
{
	public int i,j;
	
	public Demo()
	{
		System.out.println("Demo constructor");
	}
	public void fun() //Concrete Method
	{
		System.out.println("Demo fun");
	}
	
	public abstract void gun(); //Abstract Method   virtual void gun() = 0;
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Hello Constrcutor");
	}
	
	public void sun() //Concrete Method
	{
		System.out.println("Hello sun");
	}
	
	public void gun() //Concrete Method
	{
		System.out.println("Hello gun");
	}
}

class AbstractDemo1
{
	public static void main(String args[])
	{
		Demo dobj; //This is just reference so no problem
		// dobj = new Demo(); <--This is the error bcoz cant create objct
		Hello hobj = new Hello();
		hobj.fun();
		hobj.gun();
		hobj.sun();
	}
}

/*
Java Programming Language
Features of Java
JVM Architecture
Toolchain of Java
First Appication of Java
Datatypes in Java
Sizeof data types

Class Design 
Encapsulation
Constructors and its types
Object creation in java
Method and data access using . operator
Inheritance in Java
Use of Super Keyword
Types of Inheritance
polymorphism
Compile Time as function overloading
Run Time as function overloading
Run Time method dispatch
static Characteristics
final characteristics
final behaviour
final class
access specifiers
abstract class
abstract method

*/