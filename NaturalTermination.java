<<<<<<< HEAD

class MyThread extends Thread { 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName() + " - Count: " + i); 
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException e) { 
                System.out.println(Thread.currentThread().getName() + " interrupted."); 
                return;  
            } 
        } 
        System.out.println(Thread.currentThread().getName() + " finished execution."); 
    } 
} 
public class NaturalTermination { 
    public static void main(String[] args) { 
        MyThread t1 = new MyThread(); 
        t1.setName("WorkerThread"); 
 t1.start(); 
    } 
=======

class MyThread extends Thread { 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName() + " - Count: " + i); 
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException e) { 
                System.out.println(Thread.currentThread().getName() + " interrupted."); 
                return;  
            } 
        } 
        System.out.println(Thread.currentThread().getName() + " finished execution."); 
    } 
} 
public class NaturalTermination { 
    public static void main(String[] args) { 
        MyThread t1 = new MyThread(); 
        t1.setName("WorkerThread"); 
 t1.start(); 
    } 
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}