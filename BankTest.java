class Bank {
    void interest() {
        System.out.println("General Bank Interest");
    }
}

class SBI extends Bank {
    void interest() {
        System.out.println("SBI Interest = 6%");
    }
}

class ICICI extends Bank {
    void interest() {
        System.out.println("ICICI Interest = 7%");
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        b.interest();

        b = new ICICI();
        b.interest();
    }
}