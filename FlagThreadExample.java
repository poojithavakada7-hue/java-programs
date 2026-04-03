
class ControlledThread extends Thread { 
    private volatile boolean running = true; // Flag to control thread execution 
    public void run() { 
        while (running) { 
            System.out.println(Thread.currentThread().getName() + " is running..."); 
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        System.out.println(Thread.currentThread().getName() + " stopped."); 
    } 
    public void stopThread() { 
        running = false;
    } 
} 
public class FlagThreadExample { 
    public static void main(String[] args) throws InterruptedException { 
        ControlledThread t1 = new ControlledThread(); 
        t1.setName("WorkerThread"); 
        t1.start(); 
        Thread.sleep(2000); 
        t1.stopThread(); 
    } 
}