import java.util.*;
class Grade
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter sub1 marks \n");
System.out.println("enter sub2 marks \n");
System.out.println("enter sub3 marks \n");
int sub1=Sc.nextInt();
int sub2=Sc.nextInt();
int sub3=Sc.nextInt();
int total=sub1+sub2+sub3;
float avg=total/3;
System.out.println(total);
System.out.println(avg);
{
if(avg>=90)
{
System.out.println("grade s");
}
else if(avg>=80)
{
System.out.println("grade a");
}
else if(avg>50)
{
System.out.println("grade b");
}
else
{
System.out.println("fail");
}
}
}
}

