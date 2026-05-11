<<<<<<< HEAD
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
=======
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
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}