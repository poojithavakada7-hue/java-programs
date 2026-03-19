class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("Class found");
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}