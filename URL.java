package net;

import java.net.*;
public class URL 
{
	public static void main(String[] args) 
	{
		try
		{
			URL1 u=new URL1("https://www.google.com");
			System.out.println("URL: "+u.toString());
			System.out.println("Protocol: "+u.getProtocol());
			System.out.println("File Name: "+u.getFile());
			System.out.println("Host: "+u.getHost());
			System.out.println("Path: "+u.getPath());
			System.out.println("Port Number: "+u.getPort());
			System.out.println("Query: "+u.getQuery());	
		}
		catch (Exception e) { System.out.println(e); }
	}
}