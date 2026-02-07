
class Test {
 public int publicVar = 10;
 protected int protectedVar = 20;
 int defaultVar = 30;
 private int privateVar = 40;
 public void show() {
 System.out.println("Public: " + publicVar);
 System.out.println("Protected: " + protectedVar);
 System.out.println("Default: " + defaultVar);
 System.out.println("Private: " + privateVar);
 }
}
public class AccessControl {
 public static void main(String[] args) {
 Test obj = new Test();
 obj.show(); // Allowed (within same class)
 System.out.println(obj.publicVar); 
 System.out.println(obj.protectedVar);  
 System.out.println(obj.defaultVar); 
 // System.out.println(obj.privateVar);  }
}
}