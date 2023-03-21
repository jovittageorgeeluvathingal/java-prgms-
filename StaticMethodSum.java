import java.io.*;
import java.lang.*;
class StaticMethodSum
{
	static void sum(int x)
	{
		for(int i=2;i<x;i=i+2)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter  limit");
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			n=Integer.parseInt(din.readLine());
			sum(n);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
