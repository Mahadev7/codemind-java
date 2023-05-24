import java.util.Scanner;
import java.lang.Math;
public class Nearfib
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int a=0;
		int b=1;

		while (b<n)
		{
			int c=a+b;
			a=b;
			b=c;
		}
		if (Math.abs(a-n)<Math.abs(b-n))
		{
			System.out.println(a);
		}
		else if (Math.abs(a-n)==Math.abs(b-n))
		{
			System.out.print(a+" "+b);
			//System.out.print(b);
		}
		else
		{
			System.out.println(b);
		}
		}
	}