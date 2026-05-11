<<<<<<< HEAD
class Animal { 
    final void makeSound() { 
        System.out.println("Animals make sounds."); 
    } 
} 
class Dog extends Animal { 
    // Compilation error: Cannot override final method 
    // void makeSound() { 
    //     System.out.println("Dog barks."); 
    // } 
} 
public class FinalMethod { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.makeSound(); 
    } 
=======
class Animal { 
    final void makeSound() { 
        System.out.println("Animals make sounds."); 
    } 
} 
class Dog extends Animal { 
    // Compilation error: Cannot override final method 
    // void makeSound() { 
    //     System.out.println("Dog barks."); 
    // } 
} 
public class FinalMethod { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.makeSound(); 
    } 
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}