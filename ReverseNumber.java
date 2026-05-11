<<<<<<< HEAD
class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234, rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }
=======
class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234, rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }
>>>>>>> 768406040816ae72c675bc68d18b27ad7df7b1d5
}