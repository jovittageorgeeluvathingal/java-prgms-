import java.io.*;
import java.lang.*;
class Sum
{
    public void SumFn()
	{
        try
		{
			String str1;
            int n,x,sum=0;
            System.out.println("Enter x ");
			DataInputStream dis=new DataInputStream(System.in);
			str1=dis.readLine();
			x=Integer.parseInt(str1);
			while(x!=0)
			{
				n=x%10;
sum=sum+n;
				x=x/10;
			}
            System.out.println("Sum = "+sum);
        }
        catch(IOException e)
		{
            System.out.println(e);
        }
    }
}

class NumSum
{
    public static void main(String args[])
	{
        Sum s=new Sum();
        s.SumFn();
    }
}
