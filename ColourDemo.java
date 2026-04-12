import java.util.Scanner;

class ColourDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a color code (r/g/b/y/w): ");
        char color = sc.next().charAt(0);

        switch (color) {
            case 'r':
                System.out.println("red");
                break;

            case 'g':
                System.out.println("green");
                break;

            case 'b':
                System.out.println("blue");
                break;

            case 'y':
                System.out.println("yellow");
                break;

            case 'w':
                System.out.println("white");
                break;

            default:
                System.out.println("No Colour Selected");
        }

        sc.close();
    }
}