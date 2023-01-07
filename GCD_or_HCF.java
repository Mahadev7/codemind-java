import java.util.Scanner;
class Gcd71
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int t=2;
		int r=1;
		while (a>=t && b>=t)
		{
			if (a%t==0 && b%t==0)
			{
				a=a/t;
				b=b/t;
				r=r*t;
			}
			else
			{
				t+=1;
			}
		}
System.out.println(r);
	}
}
			
