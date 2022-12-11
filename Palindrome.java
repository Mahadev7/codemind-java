import java.util.Scanner;
class Palin3
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int temp=a;
int rev=0;
int p=0;
while (a>0)
{
p=a%10;
rev=rev*10+p;
a=a/10;
}
if (temp==rev)
System.out.println("True");
else
System.out.println("False");
}
}


