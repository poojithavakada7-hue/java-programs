import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, c1, r2, c2;


        System.out.print("Enter rows and columns of Matrix A: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

       
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("\nMatrix A:");
        display(A);

        System.out.println("Matrix B:");
        display(B);


        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    sum[i][j] = A[i][j] + B[i][j];

            System.out.println("Addition of matrices:");
            display(sum);
        } else {
            System.out.println("Addition not possible");
        }

        
        if (r1 == r2 && c1 == c2) {
            int[][] diff = new int[r1][c1];
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    diff[i][j] = A[i][j] - B[i][j];

            System.out.println("Subtraction of matrices:");
            display(diff);
        } else {
            System.out.println("Subtraction not possible");
        }

        
        if (c1 == r2) {
            int[][] mul = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("Multiplication of matrices:");
            display(mul);
        } else {
            System.out.println("Multiplication not possible");
        }

        System.out.println("Transpose of Matrix A:");
        int[][] transA = new int[c1][r1];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                transA[j][i] = A[i][j];
        display(transA);

                System.out.println("Row-wise sum of Matrix A:");
        for (int i = 0; i < r1; i++) {
            int sum = 0;
            for (int j = 0; j < c1; j++)
                sum += A[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }

                System.out.println("Column-wise sum of Matrix A:");
        for (int j = 0; j < c1; j++) {
            int sum = 0;
            for (int i = 0; i < r1; i++)
                sum += A[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }

                int max = A[0][0];
        int min = A[0][0];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (A[i][j] > max) max = A[i][j];
                if (A[i][j] < min) min = A[i][j];
            }
        }

        System.out.println("Largest element in Matrix A = " + max);
        System.out.println("Smallest element in Matrix A = " + min);
    }

        static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}