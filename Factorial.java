<<<<<<< HEAD
import java.util.Scanner;

class Factorial {

    // Recursive method
    static int recursiveFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * recursiveFactorial(n - 1);
    }

    // Non-Recursive (Iterative) method
    static int iterativeFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial using Recursive method: " + recursiveFactorial(num));
        System.out.println("Factorial using Non-Recursive method: " + iterativeFactorial(num));
    }
}
=======
import java.util.Scanner;

class Factorial {

    // Recursive method
    static int recursiveFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * recursiveFactorial(n - 1);
    }

    // Non-Recursive (Iterative) method
    static int iterativeFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial using Recursive method: " + recursiveFactorial(num));
        System.out.println("Factorial using Non-Recursive method: " + iterativeFactorial(num));
    }
}
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
