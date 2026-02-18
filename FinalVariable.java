public static void main(String args[])
{
class FinalVariable { 
    final int lifespan = 15; // Final variable 
    void display() { 
        System.out.println("Animal lifespan: " + lifespan); 
    } 
}
 FinalVariable obj=new FinalVariable();
obj.display();
}