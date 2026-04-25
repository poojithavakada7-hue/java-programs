class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        emp[0] = new Employee(1, "Poojitha", 30000);
        emp[1] = new Employee(2, "Ravi", 25000);
        emp[2] = new Employee(3, "Anu", 28000);

        for (Employee e : emp) {
            e.display();
        }
    }
}