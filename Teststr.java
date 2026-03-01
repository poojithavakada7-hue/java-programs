class Teststr {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        
        System.out.println("Length of str1: " + str1.length());

        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        System.out.println("Character at index 1: " + str1.charAt(1));

        
        System.out.println("Substring (1 to 4): " + str1.substring(1, 4));

        
        System.out.println("Replace l with x: " + str1.replace('l', 'x'));

       
        System.out.println("Contains 'ell': " + str1.contains("ell"));

        
        System.out.println("Index of 'o': " + str1.indexOf('o'));
    }
}