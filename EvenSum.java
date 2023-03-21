import java.io.*;
import java.lang.*;
class Even
{
    public void Sum()
	{
        try
		{
            int num,sum=0;
            System.out.println("Enter the limit");
            DataInputStream dis=new DataInputStream(System.in);
            num =Integer.parseInt(dis.readLine());
            for(int i=0;i<=num;i=i+2)
			{
                sum=sum+i;
            }
            System.out.println("Sum of "+num+" number is "+sum);
        }
        catch(IOException e)
		{
            System.out.println(e);
        }
    }
	
class EvenSum
{
    public static void main(String args[])
	{
        Even E=new Even();
        E.Sum();
    }	
}


