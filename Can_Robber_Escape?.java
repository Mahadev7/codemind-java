import java.util.Scanner;
public class maha
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int c=0;
        int[] arr=new int[a];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=Sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%2==1)
            {
                c+=1;
            }
        
        }
        if (c>2)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}