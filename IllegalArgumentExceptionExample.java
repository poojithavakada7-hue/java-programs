<<<<<<< HEAD
class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        try {
            t.setPriority(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid thread priority");
        }
    }
=======
class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        try {
            t.setPriority(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid thread priority");
        }
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}