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
}