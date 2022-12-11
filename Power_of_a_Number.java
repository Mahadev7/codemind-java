import java.lang.Math;
import java.util.Scanner;
class Mod1112
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=Sc.nextInt();
int c=Sc.nextInt();
int p=(int)Math.pow(a,b);
int d=p%c;
System.out.println(d);
}
}