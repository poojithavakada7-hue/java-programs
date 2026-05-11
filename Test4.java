<<<<<<< HEAD
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
=======
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
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}