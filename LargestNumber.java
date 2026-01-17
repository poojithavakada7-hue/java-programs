import java.util.*;
class LargestNumber
{
public static void main(String args[]) 
{
Scanner Sc = new Scanner(System.in);
int a,b;
System.out.print("Enter a value: ");
a = Sc.nextInt();
System.out.print("Enter b value: ");
b = Sc.nextInt();
 if (a > b)
            System.out.println("A is largest");
        else if (b>a)
            System.out.println("B is largest");
	else
		System.out.println("A and B are equal");

    }
}


