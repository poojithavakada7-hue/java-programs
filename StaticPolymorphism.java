class Animal {
    static void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    static void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class StaticPolymorphism {
    public static void main(String args[]) {
        Animal.move(); 
        Dog.move();     
    }
}