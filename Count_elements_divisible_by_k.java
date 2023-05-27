import java.util.Scanner;
public class element
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int[] x=new int[a];
        int c=0;
        for (int i=0;i<x.length;i++)
        {
            x[i]=Sc.nextInt();
        }
		for (int i=0;i<x.length;i++)
		{
			if (x[i]%b==0)
			{
				c+=1;
			}
		}
        System.out.println(c);
    }
}
