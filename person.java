class ThisDemo{
    String name;


   ThisDemo() {
        this("Ravi Sekhar");
        this.display();      
    }

   ThisDemo(String name) {
        this.name = name;   
    }

    void display() {
        System.out.println("Person Name is = " + name);
    }
}

class Person {
    public static void main(String args[]) {
        ThisDemo p = new ThisDemo(); 
    }
}