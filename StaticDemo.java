class Sample 
{  
    static int x = 10; 
    
    static void display() 
    { 
        x++; 
        System.out.println("x value is = " + x); 
    }
}

class StaticDemo 
{
    public static void main(String args[]) 
    { 
        System.out.println("Calling static method using Class name:");
        Sample.display(); 
        
        Sample s1 = new Sample(); 
        
        System.out.println("Calling static method using Object name:");
        s1.display(); 
    }
}