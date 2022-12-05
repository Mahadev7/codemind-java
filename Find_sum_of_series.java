import java.util.Scanner;
class Progression
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
double sum=0;
for(int i=1;i<=a;i++)
{
sum=1.0/i+sum; 
}
System.out.format("%.2f",sum);
}
}