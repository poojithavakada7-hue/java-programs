<<<<<<< HEAD
class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("Class found");
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
=======
class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("Class found");
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}