import java.lang.*;
//characteristics written inside interface are
//bydefault public static final in nature
interface Circle
{
	float PI = 3.14f; // public static final PI = 3.14f;
	
	float CalculateArea(float Radius); //public abstarct flaot CalculateArea
	float CalculateCircumference(float Radius);
}

class Area implements Circle
{
	public float CalculateArea(float Radius)
	{
		return(PI * Radius * Radius);
	}	
	public  float CalculateCircumference(float Radius)
	{
		return(2*PI*Radius);
	}
}

class Marvellous1
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		System.out.println("Value of PI is:"+Circle.PI);
		
		//Circle.PI = 6.14f;
		
		Area obj = new Area();
		float fRet = 0.0f;
		
		fRet = obj.CalculateArea(10.5f);
		System.out.println("Area is : " + fRet);
	
		fRet = obj.CalculateCircumference(10.5f);
		System.out.println("Circumference is : " + fRet);
	}
}

//Interface contains all characteristicd public static final by default
//All methods are by default public and abstarct