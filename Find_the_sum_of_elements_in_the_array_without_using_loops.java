import java.util.Scanner;
public class array
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int s=0;
        int[] arr=new int[a];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=Sc.nextInt();
            s+=arr[i];
        }
        System.out.println(s);
    }
}