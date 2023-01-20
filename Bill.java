import java.io.*;
import java.lang.*;
public class Bill
{
public static void main(String args[])
{
String apple,banana,orange,bread,milk;
int v,w;
float x,y,m;
double z;
try
{
	System.out.println("Price of Apple:50/kg ");
	System.out.println("Enter price of Apple: ");
	DataInputStream app=new DataInputStream(System.in);
	apple=app.readLine();
	v=Integer.parseInt(apple);
	System.out.println("Price of Banana:60/kg ");
	System.out.println("Enter price of Banana: ");
	DataInputStream ban=new DataInputStream(System.in);
	banana=ban.readLine();
	w=Integer.parseInt(banana);
	System.out.println("Price of Orange:120/kg ");
	System.out.println("Enter price of Orange: ");
	DataInputStream org=new DataInputStream(System.in);
	orange=org.readLine();
	x=Float.parseFloat(orange);
	System.out.println("Price of Bread:45 ");
	System.out.println("Enter price of Bread: ");
	DataInputStream bre=new DataInputStream(System.in);
	bread=bre.readLine();
	y=Float.parseFloat(bread);
	System.out.println("Price of Milk:40 ");
	System.out.println("Enter price of Milk: ");
	DataInputStream mil=new DataInputStream(System.in);
	milk=mil.readLine();
	m=Float.parseFloat(milk);
	System.out.println();
	System.out.println("********************************** ");
	System.out.println("Product name           Price");
	System.out.println("____________           ______");
	System.out.println("Apple                  "+apple);
	System.out.println("Banana                 "+banana);
	System.out.println("Orange                 "+orange);
	System.out.println("Bread                  "+bread);
	System.out.println("Milk                   "+milk);
	System.out.println("********************************** ");
	System.out.println("********************************** ");
	System.out.println("                                     ");
	System.out.println("Your total Amount: ");
	z=v+w+x+y+m;
	System.out.println("Total:"+z);
	System.out.println("                                     ");
	System.out.println("********************************** ");
	System.out.println("Thank you for shopping with us!!! ");
	System.out.println("********************************** ");
	
}
catch(IOException e)
{
	System.out.println(e);
}
}
}