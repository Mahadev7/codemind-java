import java.util.Scanner;
class Maha611
{
public static void main(String args[])
{
	Scanner Sc=new Scanner(System.in);
	int a=Sc.nextInt();
	double b=Math.sqrt(a);
	if(b==(int)b)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}