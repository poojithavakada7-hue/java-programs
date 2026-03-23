class InterruptedExceptionExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000); 
            System.out.println("Thread completed");
       } catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}