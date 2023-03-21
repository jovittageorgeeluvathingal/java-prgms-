import java.io.*;
import java.lang.*;
class test
{
	public void palfunc(int n)
	{
		int temp=n;
int rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		check(rev,temp);
	}
	public void check(int rev,int num)
	{
		if(rev==num)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}
class Palindrome
{
	public static void main(String args[])
	{
		test t=new test();
		String str;
		int num;
		DataInputStream din;
		din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the digit: ");
			num=Integer.parseInt(din.readLine());
			t.palfunc(num);
			
		}
		catch(Exception e)
		{	
			System.out.println("Error "+e);			
		}
	}
}
