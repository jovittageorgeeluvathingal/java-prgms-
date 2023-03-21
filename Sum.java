import java.io.*;
public class Sum
{
public static void main(String args[])
{
String str1,str2;
int x,y,z;
try
{
			System.out.println("Enter x ");
       DataInputStream dis=new DataInputStream(System.in);
			str1=dis.readLine();
			x=Integer.parseInt(str1);
			System.out.println("X is "+str1);
			System.out.println("Enter y");
			str2=dis.readLine();
			y=Integer.parseInt(str2);
			z=x+y;
			System.out.println("Y is "+str2);
			System.out.println("Sum of "+x+" and "+y+ " is "+z);
	
}
catch(IOException e)
{
				System.out.println(e);
}
}
}
