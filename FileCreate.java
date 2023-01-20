import java.io.*;

class FileCreate
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream f1=new FileOutputStream("File1.txt");
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter test into file");
			String dt=dis.readLine();
			f1.write(dt.getBytes());
			System.out.println("File Created");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}