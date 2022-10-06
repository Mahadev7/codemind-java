//Area Of Triangle
import java.util.Scanner;
class Of {
private static Scanner sc;
public static void main(String[] args) {
double a, b, c, Perimeter, s, Area;
sc=new Scanner(System.in);
//System.out.println();
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
Perimeter = a + b + c;
s=(a + b + c)/2; // Perimeter/2
Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.format("%.2f
",Area);
	}
}
