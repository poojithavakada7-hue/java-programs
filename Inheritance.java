// Parent class 
class Animal { 
    void eat() { 
        System.out.println("This animal eats food."); 
    } 
} 
// Child class (inherits Animal) 
class Dog extends Animal { 
    void bark() { 
        System.out.println("Dog barks."); 
    } 
} 
public class Inheritance { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.eat();  // Inherited from Animal 
        d.bark(); // Defined in Dog 
    } 
}