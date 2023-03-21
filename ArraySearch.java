import java.io.*;
import java.lang.*;
class ArraySearch
{
		public static void main(String args[])
		{
			String str;
			int a[],key,f=0;
			int n,i,temp=0;
			DataInputStream din;
			din=new DataInputStream(System.in);
			try
			{
				System.out.println("Enter the size: ");
				n=Integer.parseInt(din.readLine());
				a=new int[n];
				System.out.println("Enter Array elements: ");
				for(i=0;i<n;i++)
				{
					a[i]=Integer.parseInt(din.readLine());
				}
				System.out.println("Array elements are : ");
				for(i=0;i<n;i++)
				{
					System.out.println(a[i]);
				}
				System.out.println("Enter the element to be searched: ");
				key=Integer.parseInt(din.readLine());
				for(i=0;i<n;i++)
				{
					if(a[i]==key)
					{
						f=1;
						temp=i+1;
						break;
					}
				}
				if(f==1)
					System.out.println(a[i]+" found at the position "+temp);
				else
					System.out.println("Not Found");
			}
			catch(Exception e)
			{	
				System.out.println("Error "+e);			
			}
		}
}
