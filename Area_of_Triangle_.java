import java.util.Scanner;
import java.lang.Math;
class Area10
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
double a=Sc.nextInt();
double b=Sc.nextInt();
double c=Sc.nextInt();
double d=(a+b+c)/2;
double area=Math.sqrt((d)*(d-a)*(d-b)*(d-c));
System.out.format("%.2f",area);
Sc.close();
}
}