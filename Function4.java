import java.io.*;
import java.lang.*;
class Prgm
{
public int squareroot(int a)
{
return(a*a);
}
}
class value
{
public int a;
}
class Function4
{
public static void main(String args[])
{
try
{
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter the 1st element=");
 value p=new value();
 p.a=Integer.parseInt(dir.readLine());
 Prgm obj=new Prgm();
 int r=obj.squareroot(p.a);
 System.out.println("Squareroot is="+r);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
