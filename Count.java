import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter N value:");
	int n = sc.nextInt();
	System.out.println(" N values are:");
        int N = sc.nextInt();

        int even = 0, odd = 0, positive = 0, negative = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            // Even or Odd
            if (x % 2 == 0)
                even++;
            else
                odd++;

            // Positive or Negative
            if (x > 0)
                positive++;
            else if (x < 0)
                negative++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);

        sc.close();
    }
}