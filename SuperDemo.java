class A {
    int x;

    // Constructor
    A(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Super class method: x = " + x);
    }
}

class B extends A {
    int y;

    // Constructor
    B(int a, int b) {
        super(a);   // calling superclass constructor
        y = b;
    }

    void show() {
        super.show();   // calling superclass method
        System.out.println("Sub class method: y = " + y);
    }
}

class SuperDemo {
    public static void main(String args[]) {
        B ob = new B(10, 24);
        ob.show();
    }
}