import java.io.*;
import java.lang.*;
class Circle
{
    public void Area()
	{
        try
		{
            float r;
            System.out.println("Enter the radius");
            DataInputStream dis = new DataInputStream(System.in);
            r=Float.parseFloat(dis.readLine());
            double area=3.14*r*r;
            System.out.println("Area of circle with radius "+r+" is "+(int)area);
        }
        catch(IOException e)
		{
            System.out.println(e);
        }
    }
}
class CircleArea
{
    public static void main(String args[])
	{
        Circle c= new Circle();
        c.Area();
    }
}
