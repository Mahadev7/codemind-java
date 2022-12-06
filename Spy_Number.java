import java.util.Scanner;
class Spynum
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int s=0;
int p=1;
int m=0;
while(a>0)
{
m=a%10;
s=s+m;
p=p*m;
a=a/10;
}
if (s==p)
System.out.println("Spy Number");
else
System.out.println("Not Spy Number");
}
}