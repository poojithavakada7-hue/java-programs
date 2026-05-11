<<<<<<< HEAD
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); 
    }
=======
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); 
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}