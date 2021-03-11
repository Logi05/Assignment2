package demo;
import java.util.Scanner;
public class Prime {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i,count=0,j;
	for(i=1;i<=n;i++)
	{
		count=0;
		for(j=1;j<=i;j++)
		{
		if(i%j==0)
		{
			count++;
		}
		}
		if(count==2) 
		{
			System.out.println(i);
		}		
	}
	}
}

