import java.util.Scanner;
class Even 
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
//System.out.println("Enter a value :");
int a =Sc.nextInt();
if(a%2==0)
System.out.println("Even");
else
System.out.println("Odd");
Sc.close();
}
}