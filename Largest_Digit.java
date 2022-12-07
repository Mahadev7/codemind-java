import java.util.Scanner;
class Large
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int s=0;
int d=0;
while (a>0)
{
d=a%10;
if (s<d)
s=d;
a=a/10;
}
System.out.println(s);
}
}