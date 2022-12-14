import java.util.Scanner;
class Tables14
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=Sc.nextInt();
for(int i=1;i<=b;i++)
{
if (i%2!=0)
System.out.println(a+ " x " +i+  " = " +a*i);
}
}
}