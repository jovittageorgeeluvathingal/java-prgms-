// reading  from the key board  

import java.io.*;
import java.lang.*;
 public class samp
 {
	  public static void main (String args[])
	  {
		   String str,str1;
		   int x,y;
		   try
		   {
		   DataInputStream dis= new DataInputStream(System.in); //  data input from  keybord 
		    System.out.println(" Enter x"); //  enter the value 
		    str= dis.readLine();    // read to str
			System.out.println(" x is :" +str); //  print the value 
			
			System.out.println(" Enter y "); 
			str1=dis.readLine();
			System.out.println(" y is :" +str1);
			System.out.println("  from x y  is :"+str+ ""+str1);
		   }
		   catch(IOException e)
		   {
			 System.out.println(e);   
		   }
	  }
	 
 }
  
