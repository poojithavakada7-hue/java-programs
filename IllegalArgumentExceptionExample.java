class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        try {
            t.setPriority(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid thread priority");
        }
    }
}