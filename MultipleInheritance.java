interface Animal { 
    void eat(); 
} 
 
interface Pet { 
    void play(); 
} 
 
class Dog implements Animal, Pet { 
    public void eat() { 
        System.out.println("Dog eats food."); 
    } 
 
    public void play() { 
        System.out.println("Dog plays with owner."); 
    } 
} 
class MultipleInheritance { 
    public static void main(String[] args) { 
        Dog myDog = new Dog(); 
        myDog.eat();  // From Animal interface 
        myDog.play(); // From Pet interface 
    } 
}