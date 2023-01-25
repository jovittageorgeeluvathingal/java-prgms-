//Using File.createNewFile
import java.io.*;

class FCMethod1
{
 public static void main(String args[])
 {
 try
{
 File f1=new File("test.txt");
 //File f1=File("D:\java\programs\\test123.txt");
 boolean fc=f1.createNewFile();
 if(fc)
 System.out.println("File Created");
 else
 System.out.println("File Not Created");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}
