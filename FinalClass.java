final class Animal { 
    void makeSound() { 
        System.out.println("Animals make sounds."); 
    } 
} 
// Compilation error: Cannot inherit from a final class 
// class Dog extends Animal { 
// } 
public class FinalClass { 
    public static void main(String[] args) { 
        Animal a = new Animal(); 
        a.makeSound(); 
    } 
}