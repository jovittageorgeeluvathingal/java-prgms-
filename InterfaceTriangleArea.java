import java.io.*;
import java.lang.*;

interface Shape
{
	public double area();
	public void display();
}
 
class Triangle implements Shape
{
	double l,b;
	Triangle(double x,double y)
	{
		l=x;
		b=y;
	}
	public double area()
	{
		return(0.5*l*b);
	}
	public void display()
	{
		System.out.println("Triangle Display");
	}
}

class InterfaceTriangleArea
{
	public static void main(String args[])
	{
		double l=0;
		double b=0;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter length");
			l=Integer.parseInt(din.readLine());
			System.out.println("Enter breadth");
			b=Integer.parseInt(din.readLine());
			Triangle t=new Triangle(l,b);
			t.display();
			double ta=t.area();
			System.out.println("Area of Triangle= "+ta);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
