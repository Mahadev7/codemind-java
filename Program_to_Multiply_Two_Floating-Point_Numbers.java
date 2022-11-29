import java.util.Scanner;
class Maha12
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
//System.out.println("Enter a value:");
double a=Sc.nextDouble();
//System.out.println("Enter b value:");
double b=Sc.nextDouble();
double c=a*b;
System.out.format("%.2f",c);
Sc.close();
}
}