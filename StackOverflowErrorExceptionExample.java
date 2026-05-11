<<<<<<< HEAD
class  StackOverflowErrorExceptionExample {
    static void display() {
        display();
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught!");
        }
    }
=======
class  StackOverflowErrorExceptionExample {
    static void display() {
        display();
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught!");
        }
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}