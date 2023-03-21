import java.io.*;
import java.lang.*;
class Prgm
{
public void swap(float a,float b)
{
float temp=a;
a=b;
b=temp;
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class SwapFloat
{
public static void main(String args[])
{
try
{
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter the 1st element=");
 float a=Float.parseFloat(dir.readLine());
 System.out.println("enterthe 2nd element=");
 float b=Float.parseFloat(dir.readLine());
 Prgm obj=new Prgm();
 obj.swap(a,b);
 System.out.println("a="+a);
 System.out.println("b="+b);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
