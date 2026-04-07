class MyRunnable implements Runnable { 
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName() + " - Count: " + i); 
            try { 
  Thread.sleep(500); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 
public class RunnableExample { 
    public static void main(String[] args) { 
        MyRunnable r1 = new MyRunnable(); 
        MyRunnable r2 = new MyRunnable(); 
         
        Thread t1 = new Thread(r1, "Thread A"); 
        Thread t2 = new Thread(r2, "Thread B"); 
        t1.start(); 
        t2.start(); 
    } 
}