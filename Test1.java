<<<<<<< HEAD
interface A { 
    default void show() { 
        System.out.println("Default method from Interface A"); 
    } 
} 
interface B { 
    default void show() { 
        System.out.println("Default method from Interface B"); 
    } 
} 
// Resolving method conflict using method overriding 
class C implements A, B { 
    public void show() { 
        System.out.println("Overridden method in Class C"); 
    } 
} 
public class Test1 { 
    public static void main(String[] args) { 
        C obj = new C(); 
        obj.show(); 
    } 
=======
interface A { 
    default void show() { 
        System.out.println("Default method from Interface A"); 
    } 
} 
interface B { 
    default void show() { 
        System.out.println("Default method from Interface B"); 
    } 
} 
// Resolving method conflict using method overriding 
class C implements A, B { 
    public void show() { 
        System.out.println("Overridden method in Class C"); 
    } 
} 
public class Test1 { 
    public static void main(String[] args) { 
        C obj = new C(); 
        obj.show(); 
    } 
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}