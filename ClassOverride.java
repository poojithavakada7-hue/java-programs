class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 7.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 8.0;
    }
}

public class ClassOverride{
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Interest: " + b1.getInterestRate());
        System.out.println("HDFC Interest: " + b2.getInterestRate());
    }
}