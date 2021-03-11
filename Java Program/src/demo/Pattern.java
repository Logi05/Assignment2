package demo;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
