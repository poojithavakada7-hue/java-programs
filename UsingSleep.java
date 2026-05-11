<<<<<<< HEAD
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class UsingSleep {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
=======
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class UsingSleep {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}