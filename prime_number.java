import java.util.Scanner;
class Prime123
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int c=0;
for(int i=1;i<=a;i++)
{
if (a%i==0)
{
c=c+1;
}
}
if (c==2)
System.out.println("prime");
else
System.out.println("not a prime");
}
}