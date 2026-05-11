<<<<<<< HEAD
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
=======
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
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}