<<<<<<< HEAD
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
=======
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
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}