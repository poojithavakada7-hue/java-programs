class Sample {
    int x = 10;

    void display() {
        x++;
        System.out.println("x value is : " + x);
    }
}

class SDemo {
    public static void main(String args[]) {

        Sample s1 = new Sample();
        System.out.print("s1 Object Contains : ");
        s1.display();

        Sample s2 = new Sample();
        System.out.print("s2 Object Contains : ");
        s2.display();
    }
}