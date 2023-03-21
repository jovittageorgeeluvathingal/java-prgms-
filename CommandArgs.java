import java.io.*;
import java.lang.String.*;
public class CommandArgs
{
		public static void main(String args[])
		{
			int count,n,i=0,p=1;
			count=args.length;
			while(i<count)
			{
				n=Integer.parseInt(args[i]);
				p=p*n;
				i++;
			}	
			System.out.println("Product= "+p);
		}
}
