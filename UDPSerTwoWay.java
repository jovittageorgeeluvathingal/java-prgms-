package Networking;

import java.io.IOException;
import java.net.*;

public class UDPSerTwoWay 
{
	public static void main(String[] args) throws IOException 
	{
		byte[] b1 = new byte[2048];
		DatagramSocket ds = new DatagramSocket(1520);
		DatagramPacket dp = new DatagramPacket(b1,b1.length);//data,length
		ds.receive(dp);
		String str = new String(dp.getData());
		int num = Integer.parseInt(str.trim());
		num++;
		System.out.println ("Data1 is " +num);
		byte[] b = (String.valueOf(num)).getBytes();//send 11
		InetAddress my = InetAddress.getLocalHost();
		DatagramPacket dp1 = new DatagramPacket(b,b.length,my,1750);//data(byte array),length
		ds.send(dp1);
		System.out.println("Data is sent again");
	}
}