import java.io.*;
import java.lang.*;
class ArraySort
{
	public static void main(String args[])
	{
		String str;
		int a[];
		int n,i,j,temp=0;
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
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Sorted Array : ");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
	}
		}
		catch(Exception e)
		{	
			System.out.println("Error "+e);			
		}
	}
}
	