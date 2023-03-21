import java.io.*;
public class Swap
{
public static void main(String args[])
{
String str1,str2;
int x,y,z=0;
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
	System.out.println("Y is "+str2);
	z=x;
	x=y;
	y=z;
	System.out.println("After Swapping");
	System.out.println("x= "+x);
	System.out.println("Y= "+y);
	}
catch(IOException e)
{
		System.out.println(e);
}
}
}

