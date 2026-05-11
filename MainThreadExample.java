<<<<<<< HEAD
class MainThreadExample { 
    public static void main(String[] args) { 
        Thread t = Thread.currentThread(); 
        System.out.println("Default Main Thread: " + t); 
      
        t.setName("PrimaryThread"); 
        t.setPriority(Thread.MAX_PRIORITY);
	System.out.println("Modified Main Thread: " + t); 
    } 
=======
class MainThreadExample { 
    public static void main(String[] args) { 
        Thread t = Thread.currentThread(); 
        System.out.println("Default Main Thread: " + t); 
      
        t.setName("PrimaryThread"); 
        t.setPriority(Thread.MAX_PRIORITY);
	System.out.println("Modified Main Thread: " + t); 
    } 
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
} 