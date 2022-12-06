import java.util.Scanner;
class Perfect
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a =Sc.nextInt();
int sum=0;
for(int i=1;i<a;i++)
{
	if (a%i==0)
	sum=sum+i;
}
if (sum==a)
System.out.println("True");
else
System.out.println("False");
}
}