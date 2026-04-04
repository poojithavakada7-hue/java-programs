class InterruptibleThread extends Thread { 
    public void run() { 
        try { 
            for (int i = 1; i <= 5; i++) { 
                System.out.println(Thread.currentThread().getName() + " - Count: " + i); 
                Thread.sleep(1000); // Sleeping thread 
            } 
        } catch (InterruptedException e) { 
 System.out.println(Thread.currentThread().getName() + " was interrupted!"); 
        } 
    } 
} 
public class InterruptExample { 
    public static void main(String[] args) throws InterruptedException { 
        InterruptibleThread t1 = new InterruptibleThread(); 
        t1.setName("WorkerThread"); 
        t1.start(); 
        Thread.sleep(2500);  
        t1.interrupt();  
    } 
}