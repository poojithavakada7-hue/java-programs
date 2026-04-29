class ParametrizedConstructor
{
    int age;
    String name;

    ParametrizedConstructor(int a, String b)
    {
        age = a;
        name = b;
    }

    public static void main(String[] args)
    {
        ParametrizedConstructor obj =
            new ParametrizedConstructor(20, "Poojitha");

        System.out.println("age: " + obj.age + " name: " + obj.name);
    }
}