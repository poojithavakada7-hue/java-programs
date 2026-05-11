<<<<<<< HEAD
import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    void readAttributes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.readAttributes();

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
=======
import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    void readAttributes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.readAttributes();

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}