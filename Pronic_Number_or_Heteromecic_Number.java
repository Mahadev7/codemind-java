import java.util.Scanner;
class pronic12
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int i=0;
		for (i=0;i<n;i++)
		{
			if (i*(i+1)==n)
			{
				i=1;
				break;
			}
		}
		if (i==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}