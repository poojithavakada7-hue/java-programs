class Synchronization extends Thread {

    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Synchronization t1 = new Synchronization();
        t1.start();
    }
}