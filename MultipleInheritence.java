<<<<<<< HEAD
interface A { 
    void methodA(); 
} 
interface B { 
    void methodB(); 
} 
// Class implementing multiple interfaces 
class C implements A, B { 
    public void methodA() { 
        System.out.println("Method A from Interface A"); 
    } 
    public void methodB() { 
        System.out.println("Method B from Interface B"); 
    } 
} 
public class MultipleInheritence { 
    public static void main(String[] args) { 
        C obj = new C(); 
        obj.methodA(); 
        obj.methodB(); 
    } 
=======
interface A { 
    void methodA(); 
} 
interface B { 
    void methodB(); 
} 
// Class implementing multiple interfaces 
class C implements A, B { 
    public void methodA() { 
        System.out.println("Method A from Interface A"); 
    } 
    public void methodB() { 
        System.out.println("Method B from Interface B"); 
    } 
} 
public class MultipleInheritence { 
    public static void main(String[] args) { 
        C obj = new C(); 
        obj.methodA(); 
        obj.methodB(); 
    } 
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}