package demo;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		System.out.println("Enter a String to reverse");
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int len=s1.length();
		int i;
		System.out.println("The reversed String is: ");

		for(i=len-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));

		}
	}
	

}
