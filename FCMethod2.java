//Using FileOutputStream
import java.io.*;

class FCMethod2
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream f1=new FileOutputStream("aa.txt");
            //System.out.println("File Created");
            int i=f.read();
	  char c=(char)i;
	  System.out.println(" the text is :");
	   
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
