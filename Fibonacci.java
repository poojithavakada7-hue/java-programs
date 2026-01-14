import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        int a = 1, b = 1, c;

        System.out.print("Fibonacci Sequence: ");

        if (n >= 1)
            System.out.print(a + " ");
        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}