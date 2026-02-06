class StringOperations
{
    public static void main(String args[])
    {
        String str = "pooji";

        System.out.println("Length : " + str.length());
        System.out.println("Upper : " + str.toUpperCase());
        System.out.println("Lower : " + str.toLowerCase());
        System.out.println("Concat : " + str.concat("poojitha"));
        System.out.println("Index : " + str.indexOf('j'));
        System.out.println("Position : " + str.charAt(0));
    }
}