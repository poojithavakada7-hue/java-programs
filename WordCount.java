<<<<<<< HEAD
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
=======
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}