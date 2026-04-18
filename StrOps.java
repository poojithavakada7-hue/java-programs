import java.io.*;

class StrOps  
{
    public static void main(String args[]) throws IOException  
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first string: ");
        String str1 = br.readLine();

        System.out.print("Enter second string: ");
        String str2 = br.readLine();

        System.out.print("Enter third string: ");
        String str3 = br.readLine();

        int result, idx;

        System.out.println("Length of str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++)  
            System.out.print(str1.charAt(i));  

        System.out.println();

        if (str1.equals(str2))  
            System.out.println("str1 equals str2");  
        else  
            System.out.println("str1 does not equal str2");  

        if (str1.equals(str3))  
            System.out.println("str1 equals str3");  
        else  
            System.out.println("str1 does not equal str3");  

        result = str1.compareTo(str3);  

        if (result == 0)  
            System.out.println("str1 and str3 are equal");  
        else if (result < 0)  
            System.out.println("str1 is less than str3");  
        else  
            System.out.println("str1 is greater than str3");  

         System.out.print("Enter a sentence: ");
        String temp = br.readLine();

        System.out.print("Enter word to search: ");
        String word = br.readLine();

        idx = temp.indexOf(word);  
        System.out.println("First occurrence: " + idx);  

        idx = temp.lastIndexOf(word);  
        System.out.println("Last occurrence: " + idx);  
    }
}