interface Shape {
    void area();
}

class Circle implements Shape {
    double r = 5;

    public void area() {
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}

class Rectangle implements Shape {
    int l = 4, b = 6;

    public void area() {
        System.out.println("Rectangle Area = " + (l * b));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}