class UnsafeThread extends Thread { 
    public void run() { 
while (true) { 
            System.out.println(Thread.currentThread().getName() + " is running..."); 
            try { 
                Thread.sleep(500); 
            } 
		catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 
public class UnsafeStopExample { 
    public static void main(String[] args) throws InterruptedException { 
        UnsafeThread t1 = new UnsafeThread(); 
        t1.start();
	
        Thread.sleep(2000); 
        t1.stop(); 
    } 
} 