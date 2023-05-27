import java.util.Scanner;
public class countnotbyk
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		int k=Sc.nextInt();
		int[] a=new int[n];
		int c=0;
		for (int i=0;i<a.length;i++)
		{
			a[i]=Sc.nextInt();
		if ((a[i]%k)!=0)
		{
			c+=1;
		}
		}
	System.out.println(c);
	}
}