class Animal { 
    void eat() { 
        System.out.println("This animal eats food."); 
    } 
} 
class Mammal extends Animal { 
    void walk() { 
        System.out.println("Mammals can walk."); 
    } 
} 
class Dog extends Mammal { 
    void bark() { 
        System.out.println("Dog barks."); 
    } 
} 
 class MulitilevelInheritance { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.eat();  // Inherited from Animal 
        d.walk(); // Inherited from Mammal 
        d.bark(); // Defined in Dog 
    } 
} 
