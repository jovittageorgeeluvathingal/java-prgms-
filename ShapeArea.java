
import java.util.Scanner;
interface Shape
{
void disp();
void calc();
}
class Circle implements Shape
{
Scanner sc=new Scanner(System.in);
public void disp()
{
System.out.println("Circle");

}
public void calc()
{
int r=sc.nextInt();
double area=3.14*r*r;
System.out.println("area is "+area);
}
}
class Rectangle implements Shape
{
Scanner sc=new Scanner(System.in);
public void disp()


{
System.out.println("Rectangle");

}
public void calc()
{
int r=sc.nextInt();
int l=sc.nextInt();
int area=l*r;
System.out.println("area is "+area);
}
}
public class ShapeArea
{
public static void main(String[] args){
Shape obj=new Circle();
obj.disp();
obj.calc();
Shape obj1=new Rectangle();
obj1.disp();
obj1.calc();
}
}
