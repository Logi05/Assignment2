package demo;

import java.util.Scanner;

public class MaxMin {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a[]=new int[4];
	int min=0,max=0,i;
	for(i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("The Greatest Number is: "+max);

	min=a[0];
	for(i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("The Smallest Number is: "+min);

}
}
