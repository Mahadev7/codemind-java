import java.util.Scanner;
public class maha
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        if (a==1|| a==2)
        {
            System.out.format("%d",a-1);
        }
        else
        {
            System.out.println("2");
        }
    }
}