import java.util.Scanner;
class Celsius
{
public static void main (String args[])
{  
Scanner Sc=new Scanner(System.in);
//float F,c;
float F=Sc.nextFloat();
float C= ((F-32)*5)/9;
System.out.format("%.2f",C);
}}