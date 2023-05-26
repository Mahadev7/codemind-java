import java.lang.Math;
import java.util.Scanner;
public class Prewinn
{
	public static void main(String args[])
	{
		Scanner Sc= new Scanner(System.in);
		int n=Sc.nextInt();
		int[]  a=new int[n];
		int h=n/2;
		int s1=0;
		int s2=0;
		for (int i=0;i<a.length;i++)
		{
			a[i]=Sc.nextInt();
		}
		//System.out.println("Printing First Half elements:");
		for (int i=0;i<(a.length/2);i++)
		{
			s1+=a[i];
		}
		//System.out.println(s1);
		//System.out.println("Printing second half elements:");
		for (int i=h;i<(a.length);i++)
		{
				s2+=a[i];
		}
		//System.out.println(s2);
	int p=Math.abs(s1-s2);
	//System.out.println(p);
	if (p%4==0)
	{
		System.out.println("X");
	}
	else
	{
		System.out.println("Y");
	}
	}
}


