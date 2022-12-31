import java.util.Scanner;
class Choice
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int t=Sc.nextInt();
float c1,c2;
for(int i=0;i<t;i++)
{
int x1=Sc.nextInt();
int x2=Sc.nextInt();
int y1=Sc.nextInt();
int y2=Sc.nextInt();
c1=(float)x1/y1;
c2=(float)x2/y2;
if(c1<c2)
{
    System.out.println("1");
}
else if (c1==c2){
    System.out.println("0");
}
else
{
    System.out.println("-1");
}
}
}
}