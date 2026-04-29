
class DefaultConstructor
{
int age;
String name;
DefaultConstructor ()
{
age =19;
name="poojitha";
}
public static void main (String args[])
{
DefaultConstructor obj=new DefaultConstructor();
System.out.println("age:"+obj.age+"name:"+obj.name);
}
}