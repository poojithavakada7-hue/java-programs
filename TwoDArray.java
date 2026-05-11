<<<<<<< HEAD
import java.util.*;
class TwoDArray
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a[ ] [ ]=new int[2][2];
System.out.println("Enter Array Elements:");
for(int i=0;i<a.length;i++)
{
for (int j=0;j<a.length;j++)
{
a[i] [j]=Sc.nextInt();
}
}
System.out.println("The Array Is:");
for(int i=0;i<a.length;i++)
{
for (int j=0;j<a.length;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println(" ");
}
}
=======
import java.util.*;
class TwoDArray
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int a[ ] [ ]=new int[2][2];
System.out.println("Enter Array Elements:");
for(int i=0;i<a.length;i++)
{
for (int j=0;j<a.length;j++)
{
a[i] [j]=Sc.nextInt();
}
}
System.out.println("The Array Is:");
for(int i=0;i<a.length;i++)
{
for (int j=0;j<a.length;j++)
{
System.out.print(" "+a[i][j]);
}
System.out.println(" ");
}
}
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}