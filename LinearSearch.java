<<<<<<< HEAD
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int key, flag = 0;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        key = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == key) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
=======
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int key, flag = 0;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        key = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == key) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}