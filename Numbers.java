import java.io.*;
import java.lang.*;
class Numbers
{
public static void main(String args[])
	{
		int m,n;
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter 2 limits m and n");
			m=Integer.parseInt(din.readLine());
			n=Integer.parseInt(din.readLine());
			while(m<=n)
			{
				System.out.println(m);
				m++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

