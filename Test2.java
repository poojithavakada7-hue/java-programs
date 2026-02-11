class Animal { 
    Animal() { 
        System.out.println("Animal constructor is called."); 
    } 
} 
class Dog extends Animal { 
    Dog() { 
        super(); // Calls the Animal constructor 
        System.out.println("Dog constructor is called."); 
    } 
} 
public class Test2 { 
    public static void main(String[] args) { 
        Dog d = new Dog(); // Creating an object of Dog 
    } 
}