import java.io.*;
class A extend Thread
{ 
	public void run()
	{
		for(int i=1;i<=2;i++)
      		{
			System.out.println("from thread A:i="+i);
		}
		System.out.println("Exit from A");
	}
}
class B extend Thread
{
	public void run()
	{
		for(int j=1;j<=2;j++)	
		{
			System.out.println("from thread B:j="+j);
		}
		System.out.println("Exit from B");
        }
}
class ThreadTest
{
	public static void main(String args[])
	{
		A ob1=new A();
		ob1.start();
		B ob2=new B();
		ob2.start();
	}
} 


