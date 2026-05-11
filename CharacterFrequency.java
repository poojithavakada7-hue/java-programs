<<<<<<< HEAD
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char)i + " : " + freq[i]);
        }
    }
=======
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char)i + " : " + freq[i]);
        }
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}