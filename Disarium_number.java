import java.util.Scanner;
class Disarium
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
String a=Integer.toString(n);
int l=a.length();
int c=n;
int sum=0;
int d=0;
while (c>0)
{
	d=c%10;
	sum=sum+(int)Math.pow(d,l);
	l--;
	c=c/10;
}	
if (sum==n)
System.out.println("True");
else
System.out.println("False");
}
}