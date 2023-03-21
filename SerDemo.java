import java.io.*;

public class SerDemo
{
public static void main (String args[])
{
Student s = new Student("Arya",22,112);
try{
FileOutputStream fout = new FileOutputStream("D:\\javademo\\s.txt");
ObjectOutputStream oos= new ObjectOutputStream(fout);
oos.writeObject(s);//write
System.out.println("Serialization happened");
}
catch(IOException e){System.out.println(e);}
}
}