import java.util.*;
import java.io.*;
class Q
{
boolean produced=false;
int x;
public synchronized void produce(int i)
{
while(produced)
{
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
produced=true;
x=i;
System.out.println("produced "+x);
notify();
}
public synchronized int consume()
{
while(!produced)
{
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println(e);
}}
produced=false;
System.out.println("consumed "+x);
notify();
return x; 
}
}
class producer extends Thread
{
 Q q;
public producer(Q q)
{this.q=q;
Thread t=new Thread(this,"producer");
t.start(); }
public void run() {
int i=1;
while(i<=10) {
try{Thread.sleep(500);}catch(Exception e){}
q.produce(i++);
 }
 }
 }
class consumer extends Thread
{ Q q;
public consumer(Q q){this.q=q;
Thread t=new Thread(this,"consumer");
t.start();}
public void run() {
int i=10;
while(true) {
try{Thread.sleep(1000);}catch(Exception e){}
q.consume();
 }
 }
 }
public class ProducerConsumer4
 {
public static void main(String[] args)
{
Q q=new Q();
producer p=new producer(q);
consumer c=new consumer(q);
}
}


