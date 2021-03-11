package demo;

public class TestCalculator {
	public static void main(String args[])
	{
		Calculator c=new Calculator(5,5);
		int s=c.sub(6,3);
		int m=c.multiply(2,5);
		int d=c.divide(10,2);
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
	}
}
class Calculator{

int a,b;
public Calculator(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println(a+b);
}
public int sub(int a,int b)
{
	return a-b;
}
public int multiply(int a,int b)
{
	return a*b;
}
public int divide(int a,int b)
{
	return a/b;
}
}

