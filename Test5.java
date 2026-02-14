class Animal { 
    String type = "Animal"; 
} 
class Dog extends Animal { 
    String type = "Dog"; 
    void displayType() { 
        System.out.println("Parent type: " + super.type); // Parent variable 
        System.out.println("Child type: " + type); // Child variable 
    } 
} 
class Test5 { 
    public static void main(String[] args) { 
        Dog d = new Dog(); 
        d.displayType(); 
    } 
}