class Animal { 
    void makeSound() { 
        System.out.println("Animals make different sounds."); 
    } 
} 
class Dog extends Animal { 
    void makeSound() { 
        super.makeSound(); // Calls the parent method 
        System.out.println("Dog barks."); 
    } 
} 
public class Test4 { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.makeSound(); 
    } 
}