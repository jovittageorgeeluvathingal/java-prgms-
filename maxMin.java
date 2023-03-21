import java.io.*;
import java.lang.*;
public class MaxMin
{
	public static void main(String args[])
	{
		int a,b,c;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter 3 numbers");
			a=Integer.parseInt(din.readLine());
			b=Integer.parseInt(din.readLine());
			c=Integer.parseInt(din.readLine());
			if(a>b)
			{
				if(a>c)
				{
System.out.println(a+" is largest among "+b+" and "+c);
				}
				else
				{
System.out.println(c+" is largest among "+a+" and "+b);
				}
			}
			if(b>a)
			{
				if(b>c)
				{
System.out.println(b+" is largest among "+a+" and "+c);
				}
else
				{
System.out.println(c+" is largest among "+a+" and "+b);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
