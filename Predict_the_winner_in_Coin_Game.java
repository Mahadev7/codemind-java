import java.util.Scanner;
class winner
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int m=Sc.nextInt();
int n=Sc.nextInt();
if (m%2==0 || n%2==0)
System.out.println("Player 1");
else
System.out.println("Player 2");
}
}